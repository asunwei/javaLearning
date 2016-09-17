package container.instance;

import java.io.Serializable;

/**
 * javaBean满足条件
 * 一个java类满足如下基本条件
 * a.实现序列化接口
 * b.有无参构造器（或者缺省构造器）
 * c.有属性及对应的get/set方法
 *
 */
public class ExampleBean implements Serializable {
	public ExampleBean(){
		System.out.println("ExampleBean的构造器...");
	}
	
}
