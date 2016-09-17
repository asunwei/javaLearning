package com.soft.day04;

public class Demo4 {

	/**
	 * java中的方法
	 */
	public static void main(String[] args) {
		
		/*报错，需要声明一个f的方法。
		 * 首先要去新建一个f的方法。f方法要在main方法
		 * 之外，类体之内*/
	    int x=3;
		int y=f(x);//调用类体中f的方法
   		System.out.println(y);//11 
		//int c=f1(1,2);//c  也是局部变量
		//System.out.println(c);//3

	}
	/*注意：如果返回值类型不是void，就必须有return语句
	 * 如果返回值类型8种基本类型和一种引用类型组成（
	 * 例：把void变成了int），必须要有返回值return语句
	 * 在f方法中定义的类型是int，所以return的值必须是
	 * int类型。
	 * (int z) z的值在main方法中，定义了int y=f(x).
	 * x的值 相当于z的值。z相当于自变量
	 * 
	 * */
	public static int f(int z){
		int t=3*z+2;
		return t;
	}
	/*局部变量：方法的参数和方法内部的变量，都是局部变量，
	 * 局部变量的作用域只在方法的内部。
	 * 在一个方法中定义的变量只能在本方法中使用
	 * java中的形参和实参
	 * 实参：方法调用时实际传递的参数变量（实际的值，
	 * 相当与赋值）。
	 * 形参：方法中参数的定义，是一个临时变量（相当与
	 * 声明变量而没有被赋值。）
	 * */
	public static int f1(int a,int b){
		int t=a+b;// t是局部变量
		return t;
	}

}

