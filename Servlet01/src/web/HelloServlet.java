package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//设置输出内容的类型
		res.setContentType("text/html");
		//获取writer
		PrintWriter w = res.getWriter();
		//输出,为了省事输出一个标题，因为浏览器有纠错能力，也可以正确显示
		w.println("<h1>Hello.</h1>");
		//关闭writer
		w.close();
	}
	
}
