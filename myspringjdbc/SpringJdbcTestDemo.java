package com.learn.java.springjdbc;

import org.junit.Test;

public class SpringJdbcTestDemo {
	@Test
	public void test(){
		BlogsDao bdi = (BlogsDaoImpl) SpringUtil.getBean("blogsDao");
		Blogs blogs = bdi.findBlogs();
		System.out.println(blogs);
	}
	
	@Test
	public void test2(){
		BlogsDao bdi = (BlogsDaoImpl2) SpringUtil.getBean("blogsDao2");
		Blogs blogs = bdi.findBlogs();
		System.out.println(blogs);
	}
}
