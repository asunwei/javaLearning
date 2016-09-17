package com.soft.day03;

public class DemoInt {//创建一个DemoInt的类
	/**
	 * 整数类型演示
	 */
	public static void main(String[] args) {
		//byte mybyte=128;//报错，超出数据范围
		//定义一个byte类型的变量并赋值
		byte myByte=127;
		//定义一个short类型的变量并赋值
		short myShort=-32768;
		int myInt=214748364;
		long myLong=1212312312312L;
		//整数4种类型的和
		long re=myLong+myByte+myInt+myShort;
		System.out.println("结果是: "+re);
		
	}

}

