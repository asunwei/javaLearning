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
 * 充当MVC当中c（控制器），来统一处理项目中的所有请求
 *
 *规范：
 *查询员工：/findEmp.do
 */

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
	private void findEmp(HttpServletRequest req,HttpServletResponse res ) throws ServletException, IOException{
		//查询所有的员工
		EmpDao dao = new EmpDaoImpl();
		List<Emp> list = dao.findAll();
		//将数据传递给jsp
		req.setAttribute("emps", list);
		//将请求转发给jsp
		//当前的路径：/Jsp03/findEmp.do
		//目标的路径：/Jsp03/find_emp.jsp
		//获取转发器
		RequestDispatcher rd = req.getRequestDispatcher("find_emp.jsp");
		//实现转发
		rd.forward(req, res);
	}

}
