package container.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/ioc/applicationContext.xml");
		CustomerService service = ac.getBean("customerservice", CustomerService.class);
		service.cancelOrder(1);
	}
}
