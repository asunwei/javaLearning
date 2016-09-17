package com.swei.oss.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swei.oss.dao.AdminDAO;
import com.swei.oss.dao.CostDAO;
import com.swei.oss.entity.Admin;
import com.swei.oss.entity.Cost;
import com.swei.oss.service.LoginService;


/**
 * ����
 */
public class TestCase {
	@Test
	//����db.properties�ļ��Ƿ���ȷ��ȡ
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		System.out.println(ac);
	}
	
	
	@Test
	//�������ݷ��ʲ�AdminDaoImpl
	public void test2() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		AdminDAO dao = ac.getBean("adminDAO",AdminDAO.class);
		System.out.println(dao);
		Admin admin = dao.findByAdminCode("caocao");
		System.out.println(admin);
	}
	
	@Test
	//����ҵ���
	public void test3() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		LoginService service = ac.getBean("loginService",LoginService.class);
		Admin admin = service.checkLogin("caocao", "123");
		System.out.println(admin);
	}
	
	@Test
	//����CostDAOImpl
	public void test4(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		CostDAO dao = ac.getBean("costDAO",CostDAO.class);
		//Cost c = (Cost) dao.findAll();
		//System.out.println(c);
	}
}
