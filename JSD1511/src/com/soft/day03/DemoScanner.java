package com.soft.day03;
import java.util.Scanner;
public class DemoScanner {
	/**
	 *控制台输入
	 */
	public static void main(String[] args) {
		/*导包快捷键:Ctrl+Shift+o*/
		Scanner sc=new Scanner(System.in);
		//输出语句是控制台输入的提示
		System.out.println("输出年龄：");
		//从控制台输入一个整数传递给age，作为age的值
		int age=sc.nextInt();
		System.out.println("年龄是："+age+"岁");
		System.out.println("输入一个数");
		double n=sc.nextDouble();
		/*n是控制台输入的一个数，传递给n作为n的值。
		 * Math.pow是计算机中，数学方法求平方数的方法*/
		n=Math.pow(n, 2);
		System.out.println(n);
	}

}
