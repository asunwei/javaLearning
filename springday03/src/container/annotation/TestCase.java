package container.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		ExampleBean eb = ac.getBean("eb",ExampleBean.class);
		System.out.println(eb);
	}
	@Test
	//测试生命周期相关的几个方法
	public void test2(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		ExampleBean eb = ac.getBean("eb",ExampleBean.class);
		System.out.println(eb);
		ac.close();
	}
	@Test
	//测试作用域
	public void test3(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		ExampleBean eb = ac.getBean("eb",ExampleBean.class);
		ExampleBean eb2 = ac.getBean("eb",ExampleBean.class);
		System.out.println(eb==eb2);
	}
	@Test
	//测试用构造器方法@Autowired
	public void test4(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		Bar bar = ac.getBean("bar",Bar.class);
		System.out.println(bar);
	}
	@Test
	//测试用setter方法@Autowired
	public void test5(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		Bar2 bar2 = ac.getBean("bar2",Bar2.class);
		System.out.println(bar2);
	}
	@Test
	//测试@Resource
	public void test6(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		Bar3 bar3 = ac.getBean("bar3",Bar3.class);
		System.out.println(bar3);
	}
	@Test
	//测试@Resource
	public void test7(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/annotation/applicationContext.xml");
		Student student =ac.getBean("stu",Student.class);
		System.out.println(student);
	}
}
