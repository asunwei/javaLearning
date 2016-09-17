package container.other;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	//演示作用域
    public void test1(){
	//启动spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		//获得一个Bean实例，创建一个java对象
		MessageBean mes = ac.getBean("mes",MessageBean.class);
		MessageBean mes2 = ac.getBean("mes",MessageBean.class);
		System.out.println(mes == mes2);
  }
	@Test
	//演示生命周期的相关几个方法
	public void test2(){
		//ApplicationContext接口当中没有
		//定义close方法，需要使用其子类型
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		MessageBean mes = ac.getBean("mes",MessageBean.class);
		mes.sendMessage();
		//关闭容器
		ac.close();
	}
	@Test
	//演示延迟加载
	public void test3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		MessageBean mes = ac.getBean("mes",MessageBean.class);
	}
}
