package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//读取cookie
		Cookie[] cs = req.getCookies();
		if(cs != null){
			//遍历cookie
			for(Cookie c : cs){
				//根据名称找到要处理的cookie
				if(c.getName().equals("user")){
					//修改cookie的值
					c.setValue("cang");
					//将改后的cookie发送给浏览器
					res.addCookie(c);
					
				}
			}
		}
	}

}
