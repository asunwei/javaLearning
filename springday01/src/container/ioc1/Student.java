package container.ioc1;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private String age;
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
