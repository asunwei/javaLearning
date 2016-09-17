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
		System.out.println("创建FirstFilter");
	}

	public void destroy() {
		System.out.println("销毁FirdtFilter");

	}
/**
 * 该方法由TomCat自行调用
 * 因为Tomcat处理Http协议，创建的是
 * HttpServletReguest/HttpServletResponse
 * 所以Tomcat在调用此方法时出入req/res是上述类型
 * 
 * 
 * FilterChain:过滤链：多个filter之间的调用关系和顺序，
 * 他们像链条一样，从前向后一环一环调用
 * 
 * 
 * 
 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FirstFilter前过滤");
		//chain对请求有绝对的处理权
		//即他可以允许请求继续执行
		//也可以拒绝请求继续执行
		//当调用chain.doFirter()时，请求继续，否则请求终止
		//doFilter==继续调用Servlet
		chain.doFilter(req,res);
		System.out.println("FirstFilter后过滤");
	}
     //filterConfig 类似于ServletConfig，他可以给当前FIlter预置数据
	//只需要在web.xml中加以配置即可
	public void init(FilterConfig cfg) throws ServletException {
		System.out.println("初始化FirstFilter");
		System.out.println(cfg.getInitParameter("city"));
	}

}
