package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 二级控制器：
 *   负责业务处理逻辑
 *   1.不用实现Controller接口
 *   2.在一个Controller类里面，可以添加多个处理方法
 *     这些方法的方法名可以自定义，返回值可以是
 *     ModelAndView或者String
 *     http://ip:port/springmvc02/hello.jsp
 */
@Controller("hc")
public class HelloController {
	//利用注解
	@RequestMapping("/hello.do")
	public String toHello(){
		System.out.println("HelloController的toHello方法...");
		return "hello";
	}
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("toLogin方法执行了...");
		return "login";
	}
	
	@RequestMapping("/login.do")
	//获取用户名和密码
	//方法一：利用request提供的方法
	public String login(HttpServletRequest req){
		System.out.println("login方法执行了...");
	    String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		System.out.println("username:"+username+",pwd:"+pwd);
		return "success";
	}
	@RequestMapping("/login2.do")
	//获取用户名和密码
	//方法二：在处理方法里面，添加相应的参数
	public String login2(String username,@RequestParam("pwd")String password){
		System.out.println("login2方法执行了...");
		System.out.println("username:"+username+",pwd:"+password);
		return "success";
	}
	@RequestMapping("/login3.do")
	//获取用户名和密码
	//方法三：利用对象
	public String login3(User user){
		System.out.println("login3方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		return "success";
	}
	@RequestMapping("/login4.do")
	//向页面传值的第一种方式：使用request绑定数据
	public String login4(User user,HttpServletRequest req){
		System.out.println("login4方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		req.setAttribute("username", user);
		//默认情况下，使用转发方式来跳转
		return "success";
	}
	@RequestMapping("/login5.do")
	//向页面传值的第二种方式：使用ModelAndView
	public ModelAndView login5(User user){
		System.out.println("login5方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		//ModelAndView（String viewName,Map data）
		Map<String,Object> data = new HashMap<String,Object>(); 
		//相当于request.setAttrbute("user" user)
		data.put("user", user);
		return new ModelAndView("success",data);
	}
	@RequestMapping("/login6.do")
	//向页面传值的第三种方式：使用ModelMap绑定数据
	public String loginn6(User user,ModelMap data){
		System.out.println("login6方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		data.addAttribute("user",user);
		return "success";
	}
	@RequestMapping("/login7.do")
	//向页面传值的第四种方式；利用session来绑定数据
	public String login7(User user,HttpSession session){
		System.out.println("login7方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		session.setAttribute("user", user);
		return "success";
	}
	
	@RequestMapping("/login8.do")
	//重定向 返回的是String
	public String login8(User user){
		System.out.println("login8方法执行了...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		if("tom".equals(user.getUsername())){
			return "redirect:toSuccess.do"; 
		}
		return "login";
	}
	@RequestMapping("/toSuccess.do")
	public String toSuccess(){
		System.out.println("toSucess方法执行了...");
		return "success";
	}
}
