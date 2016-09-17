package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlerController {
	@RequestMapping("/demo1.do")
	public String demo1(int i,HttpServletRequest req){
		req.setAttribute("method", "demo1()");
		int[] ary = {2,3};
		System.out.println(ary[i]);
		return "ok";
	}
	@RequestMapping("/demo2.do")
	public String demo2(int i,HttpServletRequest req){
		req.setAttribute("method", "demo2()");
		int[] ary = {2,3};
		System.out.println(ary[i]);
		return "ok";
	}
	@ExceptionHandler
	public String ProcessEroor(HttpServletRequest req,Exception e) throws Exception{
		String method = (String)req.getAttribute("method");
		//如果是数组越界异常处理，其他情况抛出
		if(e instanceof ArrayIndexOutOfBoundsException){
			System.out.println(method);
			return "error2";
		}
		throw e;//抛异常springmvc
	}
}
