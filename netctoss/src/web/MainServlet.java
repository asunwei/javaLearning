package web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ImageUtil;
import dao.AdminDao;
import dao.AdminDaoImpl;
import dao.CostDao;
import dao.CostDaoImpl;
import entity.Admin;
import entity.Cost;

public class MainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.�ж������·��
		String path = req.getServletPath();
		if(path.equals("/findCost.do")){
			//��ѯ�ʷ�
			findCost(req,res);
		} else if(path.equals("/toAddCost.do")) {
			//�������ʷ�ҳ��
			toAddCost(req,res);
		} else if(path.equals("/addCost.do")) {
			//���ӱ���
			addCost(req,res);
		} else if(path.equals("/toUpdateCost.do")){
			//���޸�ҳ��
			toUpdateCost(req,res);
		} else if(path.equals("/toLogin.do")){
			//�򿪵�¼ҳ��
			toLogin(req,res);
		} else if(path.equals("/toIndex.do")){
			//����ҳ
			toIndex(req,res);
		} else if(path.equals("/login.do")){
			//��¼У��
			login(req,res);
		} else if(path.equals("/createImage.do")) {
			//������֤��
			createImage(req,res);
		} else {
			throw new RuntimeException("���޴�ҳ��");
		}
	}
	private void findCost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//��ѯ���е��ʷ�
		CostDao dao =new CostDaoImpl();
		List<Cost> list = dao.findAll();
		//ת������ѯҳ��
		//��ǰ��·����/netctoss/findCost.do
		//Ŀ���·����/netctoss/WEB-INF/cost/find_cost.jsp
		req.setAttribute("costs", list);
		req.getRequestDispatcher("WEB-INF/cost/find_cost.jsp").forward(req, res);
	}
	private void toAddCost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//��ǰ��/netctoss/toAddCost.do
		//Ŀ�꣺/netctoss/WEB-INF/cost/add_cost.jsp
		req.getRequestDispatcher("WEB-INF/cost/add_cost.jsp").forward(req, res);
	}
	private void addCost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		//1.������е�����
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String costType = req.getParameter("costType");
		String baseDuration = req.getParameter("baseDuration");
		String baseCost = req.getParameter("baseCost");
		String unitCost = req.getParameter("unitCost");
		String descr = req.getParameter("descr");
		//2.�������ݣ�������
		Cost c = new Cost();
		c.setName(name);
		c.setCostType(costType);
		c.setDescr(descr);
		if(baseDuration!=null&&!baseDuration.equals("")){
			c.setBaseDuration(Integer.parseInt(baseDuration));
		}
		if(baseCost!=null&&!baseCost.equals("")){
			c.setBaseCost(Double.parseDouble(baseCost));
		}
		if(unitCost!=null&&!unitCost.equals("")){
			c.setUnitCost(Double.parseDouble(unitCost));
		}
		CostDao dao = new CostDaoImpl();
		dao.save(c);
		//3.�ض����ʷѲ�ѯ
		//��ǰ��/netctoss/addCost.do
		//Ŀ�꣺/netctoss/findCost.do
		res.sendRedirect("findCost.do");
	}
	private void toUpdateCost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//1.�����������
		String id = req.getParameter("costId");
		//2.��ѯҪ�޸ĵ��ʷ�
		CostDao dao = new CostDaoImpl();
		Cost cost = dao.findById(Integer.parseInt(id));
		//3.ת�����޸��ʷ�ҳ��
		//��ǰ��/netctoss/toUpDateCost.do
		//Ŀ��: /netctoss/WEB-INF/cost/update_cost.jsp
		req.setAttribute("cost", cost);
		req.getRequestDispatcher("WEB-INF/cost/update_cost.jsp").forward(req, res);
	}
	private void toLogin(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
	}
	private void toIndex(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		req.getRequestDispatcher("WEB-INF/main/index.jsp").forward(req, res);
	}
	private void login(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException{
		//1.��ȡ������
		req.setCharacterEncoding("utf-8");
		String code = req.getParameter("adminCode");
		String pwd = req.getParameter("password");
		String icode = req.getParameter("code");
		//2.������У��
		HttpSession session = req.getSession();
		String imageCode = (String)session.getAttribute("imageCode");
		if(icode == null || icode.equals("") || !icode.equalsIgnoreCase(imageCode)){
			req.setAttribute("error", "��֤�����");
			req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
			return;
		}
		AdminDao dao = new AdminDaoImpl();
		Admin admin = dao.findById(code);
		if(admin == null){
			//�ʺŲ�����
			req.setAttribute("error", "�ʺŲ�����");
			req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
		} else if(!admin.getPassword().equals(pwd)) {
			//�������
			req.setAttribute("error", "�������");
			req.getRequestDispatcher("WEB-INF/main/login.jsp").forward(req, res);
			
		} else {
			//У��ͨ��
			//���ʺŴ���cookie
			Cookie cookie = new Cookie("adminCode",code);
			res.addCookie(cookie);
			//���ʺŴ���seesion
			session.setAttribute("adminCode", code);
			res.sendRedirect("toIndex.do");
		}
	}
	private void createImage(HttpServletRequest req,HttpServletResponse res) throws IOException{
		//������֤��ͼƬ
		Object[] objs = ImageUtil.createImage();
		//����֤�����session�����ں�������֤���У��
		HttpSession session = req.getSession();
		session.setAttribute("imageCode", objs[0]);
		//��ͼƬ����������
		BufferedImage image = (BufferedImage) objs[1];
		res.setContentType("image/png");
		OutputStream os = res.getOutputStream();
//		ImageIo��һ������
		ImageIO.write(image, "png", os);
		os.close();
	}
}
