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
		//ͨ��session�д洢��adminCode
		//���ж��û��Ƿ��Ѿ��ɹ���¼
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession();
		//��filter���Թ�����������/*)
		//������3�������ܱ����˵�
		//��Ҫ����3�������ų���
		//String[] paths = {"/toLogin.do","/createImage.do","/Login.do"};
		String path = request.getServletPath();
		for(String p : paths){
			//�����ǰ��·��path������3���е�һ����
			//����Ҫִ�к����У����룬�������󼴿�
			if(p.equals(path)){
				chain.doFilter(req, res);
				return;
			}
		}
		Object adminCode = session.getAttribute("adminCode");
		if(adminCode == null){
			//û��½,ǿ����ת��¼ҳ��
			HttpServletResponse response = (HttpServletResponse) res;
			response.sendRedirect(request.getContextPath()+"/toLogin.do");
		} else {
			//��¼�ˣ��������ִ��
			chain.doFilter(req, res);
		}
	}

	public void init(FilterConfig cfg) throws ServletException {
		String epath = cfg.getInitParameter("exclusePath");
		paths = epath.split(",");
	}

}
