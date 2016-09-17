package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddEmpServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.接收表单数据
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String sal = req.getParameter("salary");
		String job = req.getParameter("job");
		//2.处理数据存入库中
		System.out.println(name);
		System.out.println(sal);
		System.out.println(job);
		//3.做出响应
//		res.setContentType("text/html;charset=utf-8");
//		PrintWriter w = res.getWriter();
//		w.println("<h1>增加成功</h1>");
//		w.close();
		//重定向到查询
		//当前：/EmpManager/addEmp
		//目标：/EmpManager/findEmp
		res.sendRedirect("findEmp");
		
	}

}
