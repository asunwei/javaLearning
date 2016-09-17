package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.读取请求行数据
		System.out.println("协议类型:"+req.getProtocol());
		System.out.println("请求方式:"+req.getMethod());
		System.out.println("servlet路径："+req.getServletPath());
		//2.读取消息头数据(key-value)
		//获取消息头中所有的key迭代器
		Enumeration e = req.getHeaderNames();
		while(e.hasMoreElements()){
			//获取key
			Object key = e.nextElement();
			//通过key获取value
			String value = req.getHeader(key.toString());
			//打印key和value
			System.out.println(key+":"+value);
		}
		//两个特殊的数据
		System.out.println("url:"+req.getRequestURL());
		System.out.println("uri:"+req.getRequestURI());
		//3.读取实体内容（由于目前还没讲传数据，暂时不读，后面再说）
		
		//1.写状态行数据(tomcat自动写)
		//2.写消息头数据
		res.setContentType("text/html");
		//3.写实体内容
		PrintWriter w = res.getWriter();
		w.println("<h1>Hi!Servlet</h1>");
		w.close();
	}
	
}
