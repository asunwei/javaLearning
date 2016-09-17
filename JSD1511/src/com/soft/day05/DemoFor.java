package com.soft.day05;

import java.util.Scanner;

public class DemoFor {

	/**
	 *for循环
	 */
	public static void main(String[] args){
		//test();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
		test10();
		//System.out.println(5);
	}
		/*使用for循环输出0-9之间的数*/
		public static void test(){
			for(int i=0;i<9;i++){
				System.out.println(i);
			}
		}
		/*使用for循环倒序输出10-1的数；*/
        public static void test2(){
        	for(int i=10;i>=1;i--){
        		System.out.println(i);
        	}
        }
        /*使用for循环输出10-20之间能被2整除的数；*/
        public static void test3(){
        	for(int i=10;i<20;i++){
        		if(i%2==0){//判断能被2整除的数
        			System.out.println(i);
        		}
        	}
        }	
        /*求出1-100数字之间的和*/
        public static void test4(){
        	int sum=0;//定义一个第三方的变量，放数值的和
        	for(int i=1;i<=100;i++){
        			sum+=i;
        	}
        	System.out.println(sum);
        }
        /*求出1-100之间的偶数和*/
        public static void test5(){
        	int sum=0;
        	for(int i=1;i<=100;i++){
        	if(i%2==0){//偶数和
        		sum+=i;
        	}	
        	}
        	System.out.println(sum);
        }
        /*分别求出1-100之间的偶数和和奇数和*/
        public static void test6(){
        	int sum1=0;//偶数
        	int sum2=0;//奇数
        	for(int i=1;i<=100;i++){
        		if(i%2==0){
        			sum1+=i;
        		}else{
        			sum2+=i;
        		}
        	}
        	System.out.println("偶数和： "+sum1);
        	System.out.println("奇数和： "+sum2);
        }
        /*for循环输出A-Z，每行显示5个 字母*/
        public static void test7(){
        	     int s=0;
        		for(char a='A';a<='Z';a++){
        			System.out.print(a +"\t");//\t表示空格
        			s++;
        			if(s%5==0){
        				System.out.println();
        			}
        			
        		}
        		
        }
        /*A和B的取值是0-9，给出A+B=12的方案*/
        public static void test8(){
        	for(int A=0;A<=9;A++){
        		for(int B=0;B<=9;B++){
        		if(A+B==12)
        			System.out.println(A+"+"+B+"="+"12");
        		}
        	}
        }
        /*for循环做出九九乘法表*/
        public static void test9(){
        	for(int i=1;i<=9;i++){
        		for(int j=1;j<=i;j++){
        		System.out.print(j+"*"+i+"="+i*j+"\t");
        	}
        	System.out.println();
        	}
        }
       /* 求出a+aa+aaa+aaaa+aaaaa的值。其中a是一个数字。*/
      /*  public static int test10(int a){
            int sum=0;
            int b=a*10000;
        	while(a>b){
        		sum+=a;
        		a=a*10;
        }
        	return sum;
        }
        */
        public static void test10(){
        	System.out.println("输入一个数字0-9");
        	Scanner sc=new Scanner(System.in);
        	int a=sc.nextInt();
        	System.out.println("请输入数字重复次数");
        	int b=sc.nextInt();
        	int s=0;
        	System.out.println("a="+a+";b="+b);
        	for(int i=b;i>0;i--){
        		s+=i*a*Math.pow(10, (b-i));
        	}
        	System.out.println("s="+s);
        }
}

 
