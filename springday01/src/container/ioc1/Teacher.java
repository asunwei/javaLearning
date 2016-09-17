package container.ioc1;

import java.io.Serializable;

public class Teacher implements Serializable{
	private String name;
	private String age;
	public Teacher(){
		System.out.println("Teacher构造器...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("使用setter方式的setName方法注入name...");
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		System.out.println("使用setter方式的setAge方法注入age");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + "]";
	}
	
}
