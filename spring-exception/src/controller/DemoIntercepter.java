package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class DemoIntercepter implements HandlerInterceptor {
	/**
	 * 1.在控制器之前执行方法
	 * 2.返回值是true时候才能继续执行后续控制器
	 * 3.可以利用request传递共享数据
	 * 4.不执行后续控制器，这里可以利用response直接返回给用户（发生短路情况）此时方法返回false
	 */
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle) throws Exception {
		System.out.println("调用了preHandler方法...");
		req.setAttribute("msg", "hello!");
		return true;
	}
	/**
	 * 1.在控制器以后执行，用于处理控制器控制以后的数据
	 * 2.req 用于共享数据
	 * 3.res 用于处理用户结果
	 * 4.view中包含控制器处理以后的“数据”和“视图”
	 */
	public void postHandle(HttpServletRequest req, HttpServletResponse res,
			Object handle, ModelAndView view) throws Exception {
		String msg = (String)req.getAttribute("msg");
		msg += "Spring!";
		req.setAttribute("msg", msg);
		System.out.println("posthandle方法执行了...");
	}
	

	/**
	 * 1.视图处理后再执行的方法，向用户发送显示结果的最后流程位置
	 * 2.可以用户处理异常
	 * 3.最后更新显示结果
	 * 
	 */
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object handle, Exception e)
			throws Exception {
		String msg = (String) req.getAttribute("msg");
		msg += "bye!";
		req.setAttribute("msg", msg);
		System.out.println("afterCompletion方法执行了...");
	}



}
