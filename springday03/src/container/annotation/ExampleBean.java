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
//eb就是默认情况下，bean的id就是首字母小写之后的类名
//如果想重新命名id，就使用@Component()形式
public class ExampleBean implements Serializable{
	public ExampleBean(){
		System.out.println("ExampleBean构造器被调用了...");
	}
	@PostConstruct
	//初始化方法
	public void init(){
		System.out.println("ExampleBean的init方法...");
	}
	@PreDestroy
	//销毁方法
	public void destroy(){
		System.out.println("ExampleBean的destroy方法...");
	}
}
