package day09;
/**
 * 测试方法中异常的抛出以及捕获策略
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
		
		System.out.println("年龄是："+p.getAge());
	}
}
