package org.tedu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		//�����������
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		System.out.println("�û�����"+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//���
		if("scott".equalsIgnoreCase(name)){
			//�û�����ռ��
			out.print("�û�����ռ��");
		} else {
			//�û�������
			out.print("�û�������");
		}
		out.close();
	}
	
}
