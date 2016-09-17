package com.soft.day04;

import java.util.Scanner;

public class DeamMax {
	
	public static void main(String[] args) {
		//从控制台输入一个数 ，传递给sc
		Scanner sc=new Scanner(System.in);
		//输出提示语句
		System.out.println("输入一个数：");
		//从控制台上输入一个x的值
		int x=sc.nextInt();
		//提示输入的数
		System.out.println("输入一个数");
		//从控制台输入的数传递给y作为y的值
		int y=sc.nextInt();
		//判断 x>y 是true 输出x的值，否则输出y的值。
		int c=x>y?x:y;
		System.out.println(c);
		//直接输出
		int x1=15;
		int y1=13;
		int c1=x1>y1?x1:y1;
		System.out.println(c1);
	}

}
