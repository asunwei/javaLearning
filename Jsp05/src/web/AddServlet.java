package web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//创建Cookie
		//参数1是数据的名字， 参数2是数据的值
		Cookie c1 = new Cookie("user","tarena");
		//设置cookie的生存时间
		//在关闭浏览器后，浏览器直接cookie会存在硬盘上，并且存活60s然后消失
		c1.setMaxAge(60);
		res.addCookie(c1);
		//创建cookie存中文
		Cookie c2 = new Cookie("city",URLEncoder.encode("北京","utf-8"));
		res.addCookie(c2);
	}

}
