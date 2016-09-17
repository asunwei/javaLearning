package com.swei.oss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.swei.oss.entity.Admin;

/**
 *权限拦截器
 *  如果没有登录，就跳到（重定向）登录页 
 *  如果登陆了，就检查权限，权限不足转到错误页面
 *  如果权限够了，返回true
 */
public class ACLInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle) throws Exception {
		//从session中获取已登录的用户信息
		//用户信息是登录时候，保存到session中的信息
		Admin user = (Admin)req.getSession().getAttribute("loginUser");
		if(user == null){
			//当用户没有登录重定向到登录页
			res.sendRedirect("toLogin.do");
			return false;
		}
		//检查权限
		//权限不足throw 不通过异常->权限不足页面
		
		return true;
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}
	

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}


}
