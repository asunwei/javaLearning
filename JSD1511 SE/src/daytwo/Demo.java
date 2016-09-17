package daytwo;

public class Demo {
	public static void main(String[] args) {
		Person person=new Person();
		person.change(person);
		System.out.println(person.age);
	}
}
		
class Person{
	int age=20;
	void change(Person person){
		person.age=30;
		System.out.println(person.age);
	}
}

