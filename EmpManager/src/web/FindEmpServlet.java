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
		//ֱ�Ӳ�ѯԱ����ȫ������(ģ��)
		List<Emp> list = new ArrayList<Emp>();
		Emp e1 = new Emp(1,"����ʦ",1000.0,"�ܼ�");
		list.add(e1);
		Emp e2 = new Emp(2,"���˾�",800.0,"��ʦ");
		list.add(e2);
		Emp e3 = new Emp(1,"������",600.0,"��ʦ");
		list.add(e3);
		//����һ����Ӧ��Ϣ��ƴһ��Ա����table��
		//��Ϊ�������������ʽ��̭���㵽Ϊֹ
		res.setContentType("text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		w.println("<input type='button' value='����' onclick='location.href=\"add_emp.html\"'/>");
		w.println("<table border='1px' width='40%' cellspacing='0'>");
		w.println("<tr>");
		w.println("    <th>���</th>");
		w.println("    <th>����</th>");
		w.println("    <th>����</th>");
		w.println("    <th>ְλ</th>");
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
