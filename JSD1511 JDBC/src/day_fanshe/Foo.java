package day_fanshe;

public class Foo {
	int age;
	String name;
	public Foo() {
	}
	public Foo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Foo [age=" + age + ", name=" + name + "]";
	}
	
}
