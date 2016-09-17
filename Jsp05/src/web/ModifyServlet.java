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
		//��ȡcookie
		Cookie[] cs = req.getCookies();
		if(cs != null){
			//����cookie
			for(Cookie c : cs){
				//���������ҵ�Ҫ�����cookie
				if(c.getName().equals("user")){
					//�޸�cookie��ֵ
					c.setValue("cang");
					//���ĺ��cookie���͸������
					res.addCookie(c);
					
				}
			}
		}
	}

}
