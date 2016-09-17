package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class DemoIntercepter implements HandlerInterceptor {
	/**
	 * 1.�ڿ�����֮ǰִ�з���
	 * 2.����ֵ��trueʱ����ܼ���ִ�к���������
	 * 3.��������request���ݹ�������
	 * 4.��ִ�к����������������������responseֱ�ӷ��ظ��û���������·�������ʱ��������false
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle) throws Exception {
		System.out.println("������preHandler����...");
		req.setAttribute("msg", "hello!");
		return true;
	}
	/**
	 * 1.�ڿ������Ժ�ִ�У����ڴ�������������Ժ������
	 * 2.req ���ڹ�������
	 * 3.res ���ڴ����û����
	 * 4.view�а��������������Ժ�ġ����ݡ��͡���ͼ��
	 */
	public void postHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle, ModelAndView view) throws Exception {
		String msg = (String)req.getAttribute("msg");
		msg += "Spring!";
		req.setAttribute("msg", msg);
		System.out.println("posthandle����ִ����...");
	}
	

	/**
	 * 1.��ͼ�������ִ�еķ��������û�������ʾ������������λ��
	 * 2.�����û������쳣
	 * 3.��������ʾ���
	 * 
	 */
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object handle, Exception e)
			throws Exception {
		String msg = (String) req.getAttribute("msg");
		msg += "bye!";
		req.setAttribute("msg", msg);
		System.out.println("afterCompletion����ִ����...");
	}



}
