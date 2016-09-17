package org.tedu.cloudnote.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.tedu.cloudnote.service.UserService;
import org.tedu.cloudnote.util.NoteResult;


public class TestRegist extends Servicetest{
	@Test
	public void test() throws Exception{
		UserService service = super.getContext().getBean("userService",UserService.class);
		NoteResult result =service.registUser("demo", "123456", "demo");
		Assert.assertEquals(1, result.getStatus());
	}
	@Test
	public void test2() throws Exception{
		UserService service = super.getContext().getBean("userService",UserService.class);
		NoteResult result =service.registUser("ss", "1234", "ss");
		Assert.assertEquals(0, result.getStatus());
	}
	
	
	@Test
	public void test3(){
		UserService service = super.getContext().getBean("txManager",UserService.class);
		System.out.println(service.getClass().getName());
		
	}
}
