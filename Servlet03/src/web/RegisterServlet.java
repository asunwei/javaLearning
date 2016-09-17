package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//在读取参数之前设置解码方式，
		req.setCharacterEncoding("utf-8");
		//获取表单提交的数据
		//String getParameter(name); 单个值
		//String [] req.getParameterValues(name);多个值
		String user =  req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] loves = req.getParameterValues("loves");
		//处理get请求中的乱码
		//byte[] b = user.getBytes("ISO8859-1");
		//user = new String(b,"UTF-8" );
		//按常规业务，应该将这些数据存入库中
		//但本案例侧重于练习如何传数据，
		//因此就简单的将这些数据打印即可
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if(loves!=null && loves.length>0){
			for(String love : loves){
				System.out.println(love);
			}
		}
		//生产响应信息
		res.setContentType("text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		w.println("<h1>你好！成功了！！</h1>");
		w.close();
	}

}
