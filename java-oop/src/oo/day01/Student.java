package oo.day01;
//学生类
public class Student {
	String name; //成员变量
	int age;
	String address;
	
	void study(){ //方法
		System.out.println(name+"在学习...");
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address);
	}
	
}







