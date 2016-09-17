package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/demo3.do")
	public String demo3(HttpServletRequest req){
		String msg = (String) req.getAttribute("msg");
		msg += "fuck!";
		req.setAttribute("msg", msg);
	    System.out.println("demo3方法执行了");
		return "demo3";
	}
	@RequestMapping("/demo4.do")
	public String demo4(HttpServletRequest req){
		System.out.println("demo4方法执行了...");
		return "demo4";
	}
}
