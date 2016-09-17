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
 * 测试
 */
public class TestCase {
	@Test
	//测试db.properties文件是否正确读取
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		System.out.println(ac);
	}
	
	
	@Test
	//测试数据访问层AdminDaoImpl
	public void test2() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		AdminDAO dao = ac.getBean("adminDAO",AdminDAO.class);
		System.out.println(dao);
		Admin admin = dao.findByAdminCode("caocao");
		System.out.println(admin);
	}
	
	@Test
	//测试业务层
	public void test3() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		LoginService service = ac.getBean("loginService",LoginService.class);
		Admin admin = service.checkLogin("caocao", "123");
		System.out.println(admin);
	}
	
	@Test
	//测试CostDAOImpl
	public void test4(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		CostDAO dao = ac.getBean("costDAO",CostDAO.class);
		//Cost c = (Cost) dao.findAll();
		//System.out.println(c);
	}
}
