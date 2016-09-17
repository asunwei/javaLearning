package container.instance;

import java.util.Date;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {
	//启动spring容器
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/instance/applicationContext.xml");
		//从容器当中获得一个对象
		//ExampleBean eb = ac.getBean("eb",ExampleBean.class);
		//System.out.println(eb);
		//获取Calendar
		//Calendar cal = ac.getBean("cal",Calendar.class);
	//	System.out.println(cal);
		//静态方法获取对象
		//Calendar cal2 = ac.getBean("cal2",Calendar.class);
		//System.out.println(cal2);
//		Date date = ac.getBean("date1",Date.class);
//		System.out.println(date);
		
		Student student = ac.getBean("student",Student.class);
		System.out.println(student);
	}
}
