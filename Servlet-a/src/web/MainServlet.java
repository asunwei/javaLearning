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
		//判断请求路径
		String path = req.getServletPath();
		if(path.equals("/findEmp.do")){
			//查询员工
			findEmp(req,res);
		} else {
			throw new RuntimeException("查无此页");
		}
	}
	public void findEmp(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//查询所有员工
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = dao.findAll();
		//将数据传给JSP
		req.setAttribute("emps", list);
		//获取转发器并转发
		req.getRequestDispatcher("/find_emp.jsp").forward(req, res);
		
	}
}
