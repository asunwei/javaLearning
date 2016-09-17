package container.value;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCase {
	@Test
	public void test1(){
		//��������
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		//���beanʵ��
		ExampleBean eb = 
			ac.getBean("eb",
					ExampleBean.class);
		System.out.println(eb);
	}
	
	@Test
	public void test2(){
		//��������
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		//���beanʵ��
		ExampleBean eb = 
			ac.getBean("eb2",
					ExampleBean.class);
		System.out.println(eb);
	}
	
	@Test
	public void test3(){
		//��������
		ApplicationContext ac = 
	new ClassPathXmlApplicationContext(
	"container/value/applicationContext.xml");
		System.out.println(
				ac.getBean("jdbc"));
	}
	
	@Test
	//����spring���ʽע��
	public void test4(){
		//��������
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
