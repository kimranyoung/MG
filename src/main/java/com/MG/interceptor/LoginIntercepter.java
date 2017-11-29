package com.MG.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginIntercepter extends HandlerInterceptorAdapter{

	private static final String LOGIN="login";
	private static final Logger logger=LoggerFactory.getLogger(LoginIntercepter.class);
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, 
			ModelAndView modelAndView) throws Exception{
		
		HttpSession session= request.getSession();
		ModelMap modelMap= modelAndView.getModelMap();
		Object CustomerVO=modelMap.get("CustomerVO");
		
		if(CustomerVO!=null) {
			logger.info("new login success");
			session.setAttribute(LOGIN, CustomerVO);
			response.sendRedirect("/success2");
		}
	}
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		HttpSession session = request.getSession();
		
		if(session.getAttribute(LOGIN)!=null) {
			logger.info("clear login");
			session.removeAttribute(LOGIN);
		}
		
		return true;
	}
}
