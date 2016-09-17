package com.soft.day04;

import java.util.Scanner;
public class Demo4If {
	public static void main(String[] args) {
		//test();
//		test2();
//		test3();
//		test4(101);
//		System.out.println(test5(2015));
		System.out.println(test6(3838));
	}
	public static void test(){//定义的test方法
		int price=150;//声明商品的单价
		if(price <50){
			System.out.println("可以购买此商品");
		}else{
			System.out.println("太贵了买不起");
		}
		
	}
	/**从控制台输入一个数（Scanner）
		如果输入的数>120 就输出超重，需要减肥
		如果输入的数<120 就输出挺好，不需要减肥*/
	public static void test2(){
		Scanner sc=new Scanner(System.in);
		System.out.println("在控制台内输入体重");
		int x=sc.nextInt();
		if(x>=120){
			System.out.println("超重，需要减肥");
		}else{
			System.out.println("挺好，不需要减肥");
		}
	}
/**
 * 将百分制的分数转换成ABCDE等级输出
90-100	A
80-89 	B
70-79	C
60-69	D
60-下	E
 * */
	public static void test3(){
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入分数");
		int x=sc.nextInt();
		if(90<=x && x<=100){
			System.out.println("A");
		}else if(80<=x && x<=89){
			System.out.println("B");
		}else if(70<=x && x<=79){
			System.out.println("C");
		}else if(60<=x && x<=69){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
	public static void test4(int x){
		if(x>100 || x<0){
			System.out.println("输出成绩有误");
			}else if(90<=x){
			System.out.println("A");
		}else if(80<=x){
			System.out.println("B");
		}else if(70<=x){
			System.out.println("C");
		}else if(60<=x){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
/**判断是否是闰年（能被4整除但不能被100整除，或者能被
400整除）*/
	public static boolean test5(int year){
		//能被400整除是润年
		if(year%400==0){
			return true;
			//能被4整除，不能被100整除是闰年
		}else if(year%4==0 && year%100!=0){
			return true;
			// 否则就不是闰年
		}else{
		return false;
		}
	}
/**输入有一个3位整数 ，将各个位的数字重新组合。返回组合
   的最大值。
例如：387->873
 * */
	public static int test6(int n){
		if(n>999 || n<100){
			return -1;
			
		}
		int b1=n%10;//表示个位数
		int b2=n/10%10;//表示十位上的数
		int b3=n/100;//表示是百位上的数
		if(b3>=b2 && b2>=b1){
			return b3*100+b2*10+b1;
		}else if(b3>=b1 && b1>=b2){
			return b3*100+b1*10+b2;
		}else if(b2>=b3 && b3>=b1){
			return b2*100+b3*10+b1;
		}else if(b2>=b1 && b1>=b3){
			return b2*100+b1*10+b3;
		}else if(b1>=b2 && b2>=b3){
			return b1*100+b2*10+b3;
		}else{
		return b1*100+b3*10+b2;
		}
	}
}
