package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import dao.EmpDaoImpl;
import entity.Emp;
/**
 * �䵱MVC����c��������������ͳһ������Ŀ�е���������
 *
 *�淶��
 *��ѯԱ����/findEmp.do
 */

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
	private void findEmp(HttpServletRequest req,HttpServletResponse res ) throws ServletException, IOException{
		//��ѯ���е�Ա��
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = dao.findAll();
		//�����ݴ��ݸ�jsp
		req.setAttribute("emps", list);
		//������ת����jsp
		//��ǰ��·����/Jsp03/findEmp.do
		//Ŀ���·����/Jsp03/find_emp.jsp
		//��ȡת����
		RequestDispatcher rd = req.getRequestDispatcher("find_emp.jsp");
		//ʵ��ת��
		rd.forward(req, res);
	}

}
