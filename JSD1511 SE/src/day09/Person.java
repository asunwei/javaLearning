package day09;
/**
 * ���ڲ���throw��throws��Ч��
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
			//����ʱ
			throw new IllegalAgeException("��������������");
		}
		this.age=age;
	}
	
}
