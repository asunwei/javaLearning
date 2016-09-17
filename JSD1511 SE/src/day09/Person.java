package day09;
/**
 * 用于测试throw与throws的效果
 * @author Administrator
 *
 */
public class Person {
	
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100){
			//运行时
			throw new IllegalAgeException("不符合人类年龄");
		}
		this.age=age;
	}
	
}
