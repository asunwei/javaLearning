package container.other;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
	@Test
	//��ʾ������
    public void test1(){
	//����spring����
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		//���һ��Beanʵ��������һ��java����
		MessageBean mes = ac.getBean("mes",MessageBean.class);
		MessageBean mes2 = ac.getBean("mes",MessageBean.class);
		System.out.println(mes == mes2);
  }
	@Test
	//��ʾ�������ڵ���ؼ�������
	public void test2(){
		//ApplicationContext�ӿڵ���û��
		//����close��������Ҫʹ����������
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		MessageBean mes = ac.getBean("mes",MessageBean.class);
		mes.sendMessage();
		//�ر�����
		ac.close();
	}
	@Test
	//��ʾ�ӳټ���
	public void test3(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("container/other/applicationContext.xml");
		MessageBean mes = ac.getBean("mes",MessageBean.class);
	}
}
