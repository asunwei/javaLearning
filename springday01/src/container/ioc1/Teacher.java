package container.ioc1;

import java.io.Serializable;

public class Teacher implements Serializable{
	private String name;
	private String age;
	public Teacher(){
		System.out.println("Teacher������...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("ʹ��setter��ʽ��setName����ע��name...");
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		System.out.println("ʹ��setter��ʽ��setAge����ע��age");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + "]";
	}
	
}
