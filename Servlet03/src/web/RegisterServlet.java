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
		//�ڶ�ȡ����֮ǰ���ý��뷽ʽ��
		req.setCharacterEncoding("utf-8");
		//��ȡ���ύ������
		//String getParameter(name); ����ֵ
		//String [] req.getParameterValues(name);���ֵ
		String user =  req.getParameter("userName");
		String pwd = req.getParameter("pwd");
		String sex = req.getParameter("sex");
		String[] loves = req.getParameterValues("loves");
		//����get�����е�����
		//byte[] b = user.getBytes("ISO8859-1");
		//user = new String(b,"UTF-8" );
		//������ҵ��Ӧ�ý���Щ���ݴ������
		//����������������ϰ��δ����ݣ�
		//��˾ͼ򵥵Ľ���Щ���ݴ�ӡ����
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		if(loves!=null && loves.length>0){
			for(String love : loves){
				System.out.println(love);
			}
		}
		//������Ӧ��Ϣ
		res.setContentType("text/html;charset=utf-8");
		PrintWriter w = res.getWriter();
		w.println("<h1>��ã��ɹ��ˣ���</h1>");
		w.close();
	}

}
