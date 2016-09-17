package container.ioc1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	//演示setter注入
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/ioc1/applicationContext.xml");
		Teacher teacher = ac.getBean("teacher",Teacher.class);
		System.out.println(teacher);
	}
	
	@Test
	//演示构造器注入
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/ioc1/applicationContext.xml");
		Student student = ac.getBean("student",Student.class);
		System.out.println(student);
	}
}