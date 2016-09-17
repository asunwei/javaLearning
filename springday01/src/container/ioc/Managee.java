package container.ioc;

import java.io.Serializable;

public class Managee implements Serializable {
	private String name;
	private String dept;
	
	public Managee() {
		System.out.println("Managee的构造器。。。");
	}
	public Managee(String name,String dept){
		System.out.println("使用构造器注入...");
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", name=" + name + "]";
	}
	
}
