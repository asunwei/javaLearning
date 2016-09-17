package container.value;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCase {
	@Test
	public void test1(){
		//启动容器
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		//获得bean实例
		ExampleBean eb = 
			ac.getBean("eb",
					ExampleBean.class);
		System.out.println(eb);
	}
	
	@Test
	public void test2(){
		//启动容器
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		//获得bean实例
		ExampleBean eb = 
			ac.getBean("eb2",
					ExampleBean.class);
		System.out.println(eb);
	}
	
	@Test
	public void test3(){
		//启动容器
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		System.out.println(
				ac.getBean("jdbc"));
	}
	
	@Test
	//测试spring表达式注入
	public void test4(){
		//启动容器
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		SomeBean sb = 
			ac.getBean("someBean",
					SomeBean.class);
		System.out.println(sb);
		Properties pt = ac.getBean("jdbc",Properties.class);
		System.out.println(pt);
	}
	
	
	
	
	
	
	
	
}
