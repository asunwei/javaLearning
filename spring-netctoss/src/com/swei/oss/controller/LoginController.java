package com.swei.oss.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swei.oss.entity.Admin;
import com.swei.oss.service.LoginService;
import com.swei.oss.service.spring.ApplicationException;

/**
 * 二级控制器
 *
 */
@Controller
public class LoginController {
	@Resource(name="loginService")
	private LoginService service;
	@RequestMapping("/toLogin.do")
	//跳转到登录页面
	public String toLogin(){
		System.out.println("toLogin方法执行了...");
		return "login";
	}
	
	@RequestMapping("/login.do")
	//处理登录请求
	public String login(String adminCode,String pwd,ModelMap data,HttpServletRequest req){
		System.out.println("login方法执行了...");
		System.out.println("adminCode:"+adminCode+"pwd:"+pwd);
		try {
			Admin admin = service.checkLogin(adminCode, pwd);
			//登录成功，将信息保存到session
			req.getSession().setAttribute("loginUser", admin);
		} catch (Exception e) {
			//记日志
			e.printStackTrace();
			if(e instanceof ApplicationException){
				data.addAttribute("adminCode",adminCode);
				//应用异常，要提示用户错误原因，并提示采用正确方式
				data.addAttribute("login_failde",e.getMessage());
				return "login";
			} else {
				//系统异常，提示稍后重试
				return "error";
			}
		}
		//登录成功
		return "redirect:toIndex.do";
	}
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index";
	}
}
