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
		//当采用通配符（/*）匹配servlet时
		//其servlet无效
		System.out.println(path);
		String uri = req.getRequestURI();
		System.out.println(uri);
		
		 String path2 = req.getServletContext().getRealPath("/views/img");
	}

}
