package container.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/autowire/applicationContext.xml");
		Bar bar = ac.getBean("bar",Bar.class);
		System.out.println(bar);
	}
}
