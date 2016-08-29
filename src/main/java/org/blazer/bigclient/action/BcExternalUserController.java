package org.blazer.bigclient.action;

import com.github.pagehelper.PageInfo;
import org.blazer.bigclient.model.BcExternalUser;
import org.blazer.bigclient.service.BcExternalUserService;
import org.blazer.bigclient.util.IntegerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by cuican on 2016-8-26.
 */
@RequestMapping("/ext")
@Controller
public class BcExternalUserController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BcExternalUserController.class);

	@Autowired
	private BcExternalUserService bcExternalUserService;

	@ResponseBody
	@RequestMapping("findByPage")
	public PageInfo<BcExternalUser> listAllUserByPage(HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, String> params = getParamMap(request);
		LOGGER.debug("currentPage:" + IntegerUtil.getInt0(params.get("currentPage")) + ", pageSize:" + IntegerUtil.getInt0(params.get("pageSize")));
		return bcExternalUserService.findByPage(params);
	}

}
