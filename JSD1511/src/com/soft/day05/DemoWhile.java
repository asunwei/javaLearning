package com.soft.day05;

public class DemoWhile {
	/**
	 * 循环语句
	 */
	public static void main(String[] args) {
    //test();
    //test1();
    test2();
	}
    public static void test(){
    	int a=0;//定义变量a
    	//当a小于5。执行while循环体
    	while(a<5){//循环的范围，是<5的数
    		System.out.println(a);//0，1，2，3，4，
    		a++;
    	}
    	System.out.println("结束循环");
    } 
    public static void test1(){
    	int i=0;
    	while(i<25){
    		System.out.print(i++ +" ");//ln表示换行输出，没有ln表示同一行输出
    		if(i%7==0){
    			System.out.println();//空的输出语句表示换行
    		}
    	}
    	System.out.println("循环结束");
    }
   //do-while
    public static void test2(){
    	int i=1;
    	//先执行do语句体内条件，然后再判断while条件
    	do{
    		System.out.println(i);
    		i++;
    	}while(i<=10);
    }
}
