package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	private String[] paths;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		//通过session中存储的adminCode
		//来判断用户是否已经成功登录
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession();
		//该filter可以过滤所有请求（/*)
		//但是有3个请求不能被过滤的
		//需要将这3个请求排除掉
		//String[] paths = {"/toLogin.do","/createImage.do","/Login.do"};
		String path = request.getServletPath();
		for(String p : paths){
			//如果当前的路径path等于这3个中的一个，
			//则不需要执行后面的校验代码，继续请求即可
			if(p.equals(path)){
				chain.doFilter(req, res);
				return;
			}
		}
		Object adminCode = session.getAttribute("adminCode");
		if(adminCode == null){
			//没登陆,强制跳转登录页面
			HttpServletResponse response = (HttpServletResponse) res;
			response.sendRedirect(request.getContextPath()+"/toLogin.do");
		} else {
			//登录了，请求继续执行
			chain.doFilter(req, res);
		}
	}

	public void init(FilterConfig cfg) throws ServletException {
		String epath = cfg.getInitParameter("exclusePath");
		paths = epath.split(",");
	}

}
