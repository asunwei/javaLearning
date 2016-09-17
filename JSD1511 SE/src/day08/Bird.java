package day08;

import java.io.Serializable;

/**
 * 实现Serializable接口，就是实现一个标志
 * Java编译器会找到这个Serializable标志
 * 自动的对对象插入两个方法：一个是读对象的方法
 * 一个是写对象的方法
 * 否则Java编译器不会插入这两个方法
 * 可以自己实现这两个方法，自定义对象的读写过程
 * 具体参考Serializable接口手册说明
 * @author Administrator
 *
 */
public class Bird implements Serializable{
	int age=5;
	String name="Tom";
	/*transient 瞬态属性
	 * 在对象序列化的时候会自动被忽略！
	 * 不需要序列化属性，可以使用transient
	 * 修饰避免序列化，节省存储空间
	 * 反序列化结果为null*/
	transient String[] children={"jerry","poll"};
	public String toString(){
		return name+"，"+age+","+children;
	}
}
