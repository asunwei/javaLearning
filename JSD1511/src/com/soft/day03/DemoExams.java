package com.soft.day03;

public class DemoExams {

	/**
	 * 自增运算
	 */
	public static void main(String[] args) {
	/**1：取出a的值为1。将值是1的变量作为a++表达式的值
	 * 2：在对b进行运算：a++整个表达式的值，值是1
	 * 把1的赋值给b作为b的值
	 * 3：然后在将a增加1，a的值是2
	 * */
//	int a=1;
//	int b=1;
//	b=a++;//a++是个表达式，值是1
//	System.out.println("a的值:"+a+"b的值"+b);
		
/*        另一个列子            */	
	/**1：a++作为整个表达式的值，赋值给等号前的a。
	 * 等号前的a算出的结果是1。
	 * 然后再去计算a++的值，a++的值是2
	 * */
//		int a=1;
//		 a=a++;
//		 System.out.println(a);
/*                另一个例子*/
		int i=10;
		i++;
		System.out.println(i);//11
		++i;
		System.out.println(i);//12
		/**
		 * 先计算i+10=12+10=22
		 * 在计算i++；*/
		int x=(i++)+10;
		System.out.println(x);//22

	}

}
