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
		//模拟查询数据
		User user = new User();
		user.setName("张三");
		user.setPassword("123");
		user.setSex("male");
		user.setLoves(new String[]{"篮球","足球","桌球"});
		Course course = new Course();
		course.setName("Java");
		course.setDays(85);
		user.setCourse(course);
		//将数据发送到JSP
		//当前：/Jsp04/demo
		//目标：/Jsp04/demo.jsp
		req.setAttribute("user", user);
		req.getRequestDispatcher("demo.jsp").forward(req, res);
	}

}
