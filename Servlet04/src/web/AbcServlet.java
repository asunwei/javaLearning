package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbcServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String path = req.getServletPath();
		//������ͨ�����/*��ƥ��servletʱ
		//��servlet��Ч
		System.out.println(path);
		String uri = req.getRequestURI();
		System.out.println(uri);
		
		 String path2 = req.getServletContext().getRealPath("/views/img");
	}

}
