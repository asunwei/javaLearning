package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter {
	public SecondFilter(){
		System.out.println("����SecondFilter");
	}

	public void destroy() {
		System.out.println("����SecondFilter");
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("SecondFilterǰ����");
		chain.doFilter(req, res);
		System.out.println("SecondFilter�����");
		
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("��ʼ��SecondFilter");
	}

}
