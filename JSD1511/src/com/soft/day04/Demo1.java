package com.soft.day04;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.println("输入数据条数：");
		//控制台输入的数据
		int a=x.nextInt();
		//规定每页显示10条数据
		int b=10;
		/*a=23 int a=a/b=2  a/b+1*/
		int c=a%b==0?a/b:a/b+1;
		
		System.out.println("需要页数："+c);
	}

}

