package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import dao.EmpDaoImpl;
import entity.Emp;

public class MainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//�ж�����·��
		String path = req.getServletPath();
		if(path.equals("/findEmp.do")){
			//��ѯԱ��
			findEmp(req,res);
		} else {
			throw new RuntimeException("���޴�ҳ");
		}
	}
	public void findEmp(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//��ѯ����Ա��
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = dao.findAll();
		//�����ݴ���JSP
		req.setAttribute("emps", list);
		//��ȡת������ת��
		req.getRequestDispatcher("/find_emp.jsp").forward(req, res);
		
	}
}
