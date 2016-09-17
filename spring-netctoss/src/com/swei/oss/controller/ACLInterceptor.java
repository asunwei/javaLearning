package com.swei.oss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.swei.oss.entity.Admin;

/**
 *Ȩ��������
 *  ���û�е�¼�����������ض��򣩵�¼ҳ 
 *  �����½�ˣ��ͼ��Ȩ�ޣ�Ȩ�޲���ת������ҳ��
 *  ���Ȩ�޹��ˣ�����true
 */
public class ACLInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle) throws Exception {
		//��session�л�ȡ�ѵ�¼���û���Ϣ
		//�û���Ϣ�ǵ�¼ʱ�򣬱��浽session�е���Ϣ
		Admin user = (Admin)req.getSession().getAttribute("loginUser");
		if(user == null){
			//���û�û�е�¼�ض��򵽵�¼ҳ
			res.sendRedirect("toLogin.do");
			return false;
		}
		//���Ȩ��
		//Ȩ�޲���throw ��ͨ���쳣->Ȩ�޲���ҳ��
		
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
