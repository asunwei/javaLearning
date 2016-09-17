package com.soft.day02;

public class DemoType {

	/**
	 * 变量
	 */
	public static void main(String[] args) {
		//定义一个整数类型的变量，变量名为age
		int age=18;
		//int age=10;//重复定义
		//byte age =10;//变量重复定义
		//注：有黄色下划线因为变量没有使用到
		System.out.println(age);//18
		if(age >20){
			int sc=30;
			System.out.println(sc);
		}
		//报错，原因输出的sc已经超过变量范围。
		//System.out.println(sc);
	}
	

}
