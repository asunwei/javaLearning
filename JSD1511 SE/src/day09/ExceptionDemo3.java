package day09;
/**
 * ���Է������쳣���׳��Լ��������
 * @author Administrator
 *
 */
public class ExceptionDemo3 {
	public static void main(String[] args)  {
		Person p=new Person();
		
		try {
			p.setAge(250);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�����ǣ�"+p.getAge());
	}
}
