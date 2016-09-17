package container.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	//演示setter注入
	public void test1(){
		System.out.println(1);
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/ioc/applicationContext.xml");
		System.out.println(2);
		MobilePhone mp = ac.getBean("mp",MobilePhone.class);
		System.out.println(3);
		System.out.println(mp);
		
	}
	@Test 
	//演示构造器注入
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/ioc/applicationContext.xml");
		Managee manager = ac.getBean("managee",Managee.class);
		System.out.println(manager);
	}
}
