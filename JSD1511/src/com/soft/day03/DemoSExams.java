package com.soft.day03;

public class DemoSExams {

	/**
	 * 三木运算
	 */
	public static void main(String[] args) {
		int x=32;
		int y=23;
		/*x<y是个条件表达式，如果条件表达式是真，取
		 * 问号后面的值，如果条件表达式的值是假，取
		 * 冒号后面的值*/
		int t=x<y?x:y;
		System.out.println(t);
		

	}

}

