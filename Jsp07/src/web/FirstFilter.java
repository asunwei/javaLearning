package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter {
	public FirstFilter(){
		System.out.println("����FirstFilter");
	}

	public void destroy() {
		System.out.println("����FirdtFilter");

	}
/**
 * �÷�����TomCat���е���
 * ��ΪTomcat����HttpЭ�飬��������
 * HttpServletReguest/HttpServletResponse
 * ����Tomcat�ڵ��ô˷���ʱ����req/res����������
 * 
 * 
 * FilterChain:�����������filter֮��ĵ��ù�ϵ��˳��
 * ����������һ������ǰ���һ��һ������
 * 
 * 
 * 
 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FirstFilterǰ����");
		//chain�������о��ԵĴ���Ȩ
		//�������������������ִ��
		//Ҳ���Ծܾ��������ִ��
		//������chain.doFirter()ʱ���������������������ֹ
		//doFilter==��������Servlet
		chain.doFilter(req,res);
		System.out.println("FirstFilter�����");
	}
     //filterConfig ������ServletConfig�������Ը���ǰFIlterԤ������
	//ֻ��Ҫ��web.xml�м������ü���
	public void init(FilterConfig cfg) throws ServletException {
		System.out.println("��ʼ��FirstFilter");
		System.out.println(cfg.getInitParameter("city"));
	}

}
