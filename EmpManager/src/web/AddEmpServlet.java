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
		//1.���ձ�����
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String sal = req.getParameter("salary");
		String job = req.getParameter("job");
		//2.�������ݴ������
		System.out.println(name);
		System.out.println(sal);
		System.out.println(job);
		//3.������Ӧ
//		res.setContentType("text/html;charset=utf-8");
//		PrintWriter w = res.getWriter();
//		w.println("<h1>���ӳɹ�</h1>");
//		w.close();
		//�ض��򵽲�ѯ
		//��ǰ��/EmpManager/addEmp
		//Ŀ�꣺/EmpManager/findEmp
		res.sendRedirect("findEmp");
		
	}

}
