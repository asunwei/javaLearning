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
		//����������ݵ�����
		res.setContentType("text/html");
		//��ȡwriter
		PrintWriter w = res.getWriter();
		//���,Ϊ��ʡ�����һ�����⣬��Ϊ������о���������Ҳ������ȷ��ʾ
		w.println("<h1>Hello.</h1>");
		//�ر�writer
		w.close();
	}
	
}
