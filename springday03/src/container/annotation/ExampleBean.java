package container.annotation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("eb")
@Scope("prototype")
@Lazy(true)
//eb����Ĭ������£�bean��id��������ĸСд֮�������
//�������������id����ʹ��@Component()��ʽ
public class ExampleBean implements Serializable{
	public ExampleBean(){
		System.out.println("ExampleBean��������������...");
	}
	@PostConstruct
	//��ʼ������
	public void init(){
		System.out.println("ExampleBean��init����...");
	}
	@PreDestroy
	//���ٷ���
	public void destroy(){
		System.out.println("ExampleBean��destroy����...");
	}
}
