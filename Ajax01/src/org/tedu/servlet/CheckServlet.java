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
		//接收请求参数
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		System.out.println("用户名："+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//检查
		if("scott".equalsIgnoreCase(name)){
			//用户名被占用
			out.print("用户名被占用");
		} else {
			//用户名可用
			out.print("用户名可用");
		}
		out.close();
	}
	
}
