package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.��ȡ����������
		System.out.println("Э������:"+req.getProtocol());
		System.out.println("����ʽ:"+req.getMethod());
		System.out.println("servlet·����"+req.getServletPath());
		//2.��ȡ��Ϣͷ����(key-value)
		//��ȡ��Ϣͷ�����е�key������
		Enumeration e = req.getHeaderNames();
		while(e.hasMoreElements()){
			//��ȡkey
			Object key = e.nextElement();
			//ͨ��key��ȡvalue
			String value = req.getHeader(key.toString());
			//��ӡkey��value
			System.out.println(key+":"+value);
		}
		//�������������
		System.out.println("url:"+req.getRequestURL());
		System.out.println("uri:"+req.getRequestURI());
		//3.��ȡʵ�����ݣ�����Ŀǰ��û�������ݣ���ʱ������������˵��
		
		//1.д״̬������(tomcat�Զ�д)
		//2.д��Ϣͷ����
		res.setContentType("text/html");
		//3.дʵ������
		PrintWriter w = res.getWriter();
		w.println("<h1>Hi!Servlet</h1>");
		w.close();
	}
	
}
