package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Course;
import entity.User;

public class DemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//ģ���ѯ����
		User user = new User();
		user.setName("����");
		user.setPassword("123");
		user.setSex("male");
		user.setLoves(new String[]{"����","����","����"});
		Course course = new Course();
		course.setName("Java");
		course.setDays(85);
		user.setCourse(course);
		//�����ݷ��͵�JSP
		//��ǰ��/Jsp04/demo
		//Ŀ�꣺/Jsp04/demo.jsp
		req.setAttribute("user", user);
		req.getRequestDispatcher("demo.jsp").forward(req, res);
	}

}
