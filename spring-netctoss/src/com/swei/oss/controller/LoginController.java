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
 * ����������
 *
 */
@Controller
public class LoginController {
	@Resource(name="loginService")
	private LoginService service;
	@RequestMapping("/toLogin.do")
	//��ת����¼ҳ��
	public String toLogin(){
		System.out.println("toLogin����ִ����...");
		return "login";
	}
	
	@RequestMapping("/login.do")
	//�����¼����
	public String login(String adminCode,String pwd,ModelMap data,HttpServletRequest req){
		System.out.println("login����ִ����...");
		System.out.println("adminCode:"+adminCode+"pwd:"+pwd);
		try {
			Admin admin = service.checkLogin(adminCode, pwd);
			//��¼�ɹ�������Ϣ���浽session
			req.getSession().setAttribute("loginUser", admin);
		} catch (Exception e) {
			//����־
			e.printStackTrace();
			if(e instanceof ApplicationException){
				data.addAttribute("adminCode",adminCode);
				//Ӧ���쳣��Ҫ��ʾ�û�����ԭ�򣬲���ʾ������ȷ��ʽ
				data.addAttribute("login_failde",e.getMessage());
				return "login";
			} else {
				//ϵͳ�쳣����ʾ�Ժ�����
				return "error";
			}
		}
		//��¼�ɹ�
		return "redirect:toIndex.do";
	}
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index";
	}
}
