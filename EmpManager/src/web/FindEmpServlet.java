package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Emp;

public class FindEmpServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//直接查询员工的全部数据(模拟)
		List<Emp> list = new ArrayList<Emp>();
		Emp e1 = new Emp(1,"苍老师",1000.0,"总监");
		list.add(e1);
		Emp e2 = new Emp(2,"王克晶",800.0,"讲师");
		list.add(e2);
		Emp e3 = new Emp(1,"范传奇",600.0,"讲师");
		list.add(e3);
		//生成一个响应信息（拼一个员工的table）
		//因为这个开发开发方式淘汰，点到为止
		res.setContentType("text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		w.println("<input type='button' value='增加' onclick='location.href=\"add_emp.html\"'/>");
		w.println("<table border='1px' width='40%' cellspacing='0'>");
		w.println("<tr>");
		w.println("    <th>编号</th>");
		w.println("    <th>姓名</th>");
		w.println("    <th>工资</th>");
		w.println("    <th>职位</th>");
		w.println("</tr>");
		for(Emp e:list){
			w.println("<tr>");
			w.println("<td>"+e.getId()+"</td>");
			w.println("<td>"+e.getName()+"</td>");
			w.println("<td>"+e.getSalary()+"</td>");
			w.println("<td>"+e.getJob()+"</td>");
			w.println("</tr>");
		}
		w.println("</table>");
		w.close();
	}

}
