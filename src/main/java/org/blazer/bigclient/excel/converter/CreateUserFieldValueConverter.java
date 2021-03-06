package org.blazer.bigclient.excel.converter;

import org.blazer.bigclient.excel.ExcelException;
import org.blazer.bigclient.excel.ResolveFieldValueConverter;
import org.blazer.bigclient.excel.vo.FieldValue;
import org.blazer.bigclient.model.ClFormalUser;

/**
 * 自定义转换,测试学生创建人
 * @author lisuo
 *
 */
//与spring集成之后可以使用
//@Component
public class CreateUserFieldValueConverter implements ResolveFieldValueConverter{

	@Override
	public Object resolveFieldValue(Object bean, Object value, FieldValue fieldValue, Type type, int rowNum)
			throws Exception {
		//如果是导入
		if(type==Type.IMPORT){
			if(queryForDb(value.toString())){
				//这里可以重新对对象进行设置
				ClFormalUser stu = (ClFormalUser) bean;
				stu.setUserIdentify("DHK0000");
				//stu.setCreateUserId(xx);
				return value;
			}else{
				StringBuilder err = new StringBuilder()
						.append("第[").append(rowNum).append("行],[")
						.append(fieldValue.getTitle()).append("]")
						.append("在数据库中没有找到["+value.toString()+"]的用户信息");
				throw new ExcelException(err.toString());
			}
			
		}
		return value;
	}
	
	//模拟查询数据库
	private boolean queryForDb(String createUser){
		if(createUser.startsWith("王五")){
			System.out.println("数据库有查询到王五,发生在org.blazer.bigclient.excel.test.converter.CreateUserFieldValueConverter");
			return true;
		}
		return false;
	}
	
}
