package com.soft.day03;

public class DemoExam {

	/**
	 * 算数运算
	 */
	public static void main(String[] args) {
		//算数运算
		int a=60;
		int b=20;
		System.out.println("和是 ："+(a+b));//80
		System.out.println("差是 ："+(a-b));//40
		System.out.println("积是 ："+(a*b));//1200
		System.out.println("商是 :"+(a/b));//3
		System.out.println("取余:"+(a%b));//0
		int c=10;
		System.out.println(c%4);//2
	//赋值运算
		int e,f,g;
		e=15;//15
		g=f=e+4;//g=f=19
		e +=1;//e=e+1
		System.out.println("f的值为"+f);
		System.out.println("g的值为"+g);
		System.out.println("e的值为"+e);
	}

}

