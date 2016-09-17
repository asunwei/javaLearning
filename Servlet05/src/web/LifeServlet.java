package web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet {
	public LifeServlet(){
		System.out.println("����servlet");
	}
	//�÷�����tomcat�Զ�����
	//tomcatֻ����ø��������ȶ���õķ���
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		//����=ʵ����
		//��ʼ���Ǹ��������Ԥ��һЩ����
		System.out.println("��ʼ��Servlet");
		System.out.println(config.getInitParameter("city"));
		System.out.println(config.getInitParameter("company"));
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("����Servlet");
		ServletConfig cfg = getServletConfig();
		System.out.println(cfg.getInitParameter("city"));
	}
	//�÷�����TomCat�Զ�����
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("����Servlet");
		ServletConfig cfg = getServletConfig();
		System.out.println(cfg.getInitParameter("company"));
	}

}
