package org.tedu.cloudnote.dao.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tedu.cloudnote.dao.UserDao;
import org.tedu.cloudnote.entity.User;

public class TestFindByName {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserDao dao = ac.getBean("userDao",UserDao.class);
		User user = dao.findByName("demo");
		//采用断言你，比对实际结果和预期结果
		Assert.assertNotNull(user);
		System.out.println(user);
		if(user != null){
			System.out.println(user.getCn_user_password());
		} else {
			System.out.println("用户不存在");
		}
	}
	@Test
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserDao dao = ac.getBean("userDao",UserDao.class);
		User user = dao.findByName("demo1");
		//采用断言你，比对实际结果和预期结果
		Assert.assertNotNull(user);
	}
}
