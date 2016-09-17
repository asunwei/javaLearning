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
 * ������������
 *   ����ҵ�����߼�
 *   1.����ʵ��Controller�ӿ�
 *   2.��һ��Controller�����棬������Ӷ��������
 *     ��Щ�����ķ����������Զ��壬����ֵ������
 *     ModelAndView����String
 *     http://ip:port/springmvc02/hello.jsp
 */
@Controller("hc")
public class HelloController {
	//����ע��
	@RequestMapping("/hello.do")
	public String toHello(){
		System.out.println("HelloController��toHello����...");
		return "hello";
	}
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("toLogin����ִ����...");
		return "login";
	}
	
	@RequestMapping("/login.do")
	//��ȡ�û���������
	//����һ������request�ṩ�ķ���
	public String login(HttpServletRequest req){
		System.out.println("login����ִ����...");
	    String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		System.out.println("username:"+username+",pwd:"+pwd);
		return "success";
	}
	@RequestMapping("/login2.do")
	//��ȡ�û���������
	//���������ڴ��������棬�����Ӧ�Ĳ���
	public String login2(String username,@RequestParam("pwd")String password){
		System.out.println("login2����ִ����...");
		System.out.println("username:"+username+",pwd:"+password);
		return "success";
	}
	@RequestMapping("/login3.do")
	//��ȡ�û���������
	//�����������ö���
	public String login3(User user){
		System.out.println("login3����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		return "success";
	}
	@RequestMapping("/login4.do")
	//��ҳ�洫ֵ�ĵ�һ�ַ�ʽ��ʹ��request������
	public String login4(User user,HttpServletRequest req){
		System.out.println("login4����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		req.setAttribute("username", user);
		//Ĭ������£�ʹ��ת����ʽ����ת
		return "success";
	}
	@RequestMapping("/login5.do")
	//��ҳ�洫ֵ�ĵڶ��ַ�ʽ��ʹ��ModelAndView
	public ModelAndView login5(User user){
		System.out.println("login5����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		//ModelAndView��String viewName,Map data��
		Map<String,Object> data = new HashMap<String,Object>(); 
		//�൱��request.setAttrbute("user" user)
		data.put("user", user);
		return new ModelAndView("success",data);
	}
	@RequestMapping("/login6.do")
	//��ҳ�洫ֵ�ĵ����ַ�ʽ��ʹ��ModelMap������
	public String loginn6(User user,ModelMap data){
		System.out.println("login6����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		data.addAttribute("user",user);
		return "success";
	}
	@RequestMapping("/login7.do")
	//��ҳ�洫ֵ�ĵ����ַ�ʽ������session��������
	public String login7(User user,HttpSession session){
		System.out.println("login7����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		session.setAttribute("user", user);
		return "success";
	}
	
	@RequestMapping("/login8.do")
	//�ض��� ���ص���String
	public String login8(User user){
		System.out.println("login8����ִ����...");
		System.out.println(user.getUsername()+":"+user.getPwd());
		if("tom".equals(user.getUsername())){
			return "redirect:toSuccess.do"; 
		}
		return "login";
	}
	@RequestMapping("/toSuccess.do")
	public String toSuccess(){
		System.out.println("toSucess����ִ����...");
		return "success";
	}
}
