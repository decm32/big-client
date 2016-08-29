package org.blazer.bigclient.action;

import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hyy
 */
public class BaseController {

	public HashMap<String, String> getParamMap(HttpServletRequest request) {
		HashMap<String, String> paramMap = new HashMap<String, String>();
		Enumeration<String> enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			paramMap.put(key, request.getParameter(key));
		}
		return paramMap;
	}

}
