package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet {
	public LifeServlet(){
		System.out.println("创建servlet");
	}
	//该方法由tomcat自动调用
	//tomcat只会调用父类中事先定义好的方法
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		//创建=实例化
		//初始化是给这个对象预置一些数据
		System.out.println("初始化Servlet");
		System.out.println(config.getInitParameter("city"));
		System.out.println(config.getInitParameter("company"));
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("调用Servlet");
		ServletConfig cfg = getServletConfig();
		System.out.println(cfg.getInitParameter("city"));
	}
	//该方法由TomCat自动调用
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("销毁Servlet");
		ServletConfig cfg = getServletConfig();
		System.out.println(cfg.getInitParameter("company"));
	}

}
