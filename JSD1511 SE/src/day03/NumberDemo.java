package day03;
/*
 * 包装类
 * 用于解决基本类型不能参与面向对象开发的问题
 * 包装类可以将基本类型以对象的形式存在
 * 从未具有了面向对象的相关特性
 * 数字类型包装类继承自Number类，可以将6个数字类型之间转换
 * */
public class NumberDemo {
	public static void main(String[] args) {
		double d=123.123;
		//将基本类型转换为包装类
		//1:调用构造方法
		Double d1=new Double(d);
		//2:使用静态方法valueOf
		Double d2=Double.valueOf(d);
		
		//推荐使用valueOf的形式创建包装类实例
		int i=127;
		//Integer可以重用1字节以内的整数包装对象
		Integer i1=Integer.valueOf(i);
		Integer i2=Integer.valueOf(i);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		/*
		 * 从引用类型转换为基本类型
		 * 可以转换为任意数字基本类型，但是注意
		 * 若转换基本类型长度不足，可以返回数字会有缺失
		 * 
		 */
		//Double-->double
		d=d1.doubleValue();
		System.out.println("d:"+d);
		//Double-->int 
		i=d1.intValue();
		System.out.println("i:"+i);
		//Double-->byte
		byte b=d1.byteValue();
		System.out.println("b:"+b);
	}
}
