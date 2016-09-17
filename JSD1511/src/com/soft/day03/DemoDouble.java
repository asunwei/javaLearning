package com.soft.day03;

public class DemoDouble {

	/**
	 * 浮点类型
	 */
	public static void main(String[] args) {
		int a=0x7fffffff;//a变量是int类型最大值
		int b=0x7ffffff0;//b变量是比a小15的数
		System.out.println(a);
		System.out.println(b);
		float fa=a;//把int类型a的最大值传递给fa
		float fb=b;//把int类型b的值传递给fb
		 System.out.println("fa的结果是 ："+fa);
		 System.out.println("fb的结果是 : "+fb);
	double da=a;//把int类型a的值传递给double类型da
	double db=b;//把int类型b的值传递给double类型db
	System.out.println("da的结果是 ："+da);
	System.out.println("db的结果是 ："+db);
	}

}

