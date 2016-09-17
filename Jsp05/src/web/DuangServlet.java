package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DuangServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Cookie c = new Cookie("company","TERENA");
		//cookie默认有效路径为/Jsp05/dd
		//修改设置cookie有效路径
		//可以改为：/Jsp05/demo也可以直接改为Jsp05
		c.setPath(req.getContextPath());
		res.addCookie(c);
	}

}
