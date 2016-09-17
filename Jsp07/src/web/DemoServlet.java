package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("µ÷ÓÃServlet");
		HttpSession session = req.getSession();
		session.setAttribute("x", 1);
		res.setContentType("text/html");
		PrintWriter w = res.getWriter();
		w.print("<h1>Demo</h1>");
		w.close();
	}

	

}
