package com.soft.day05;

import java.util.Scanner;

public class DemoFor {

	/**
	 *forѭ��
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
		/*ʹ��forѭ�����0-9֮�����*/
		public static void test(){
			for(int i=0;i<9;i++){
				System.out.println(i);
			}
		}
		/*ʹ��forѭ���������10-1������*/
        public static void test2(){
        	for(int i=10;i>=1;i--){
        		System.out.println(i);
        	}
        }
        /*ʹ��forѭ�����10-20֮���ܱ�2����������*/
        public static void test3(){
        	for(int i=10;i<20;i++){
        		if(i%2==0){//�ж��ܱ�2��������
        			System.out.println(i);
        		}
        	}
        }	
        /*���1-100����֮��ĺ�*/
        public static void test4(){
        	int sum=0;//����һ���������ı���������ֵ�ĺ�
        	for(int i=1;i<=100;i++){
        			sum+=i;
        	}
        	System.out.println(sum);
        }
        /*���1-100֮���ż����*/
        public static void test5(){
        	int sum=0;
        	for(int i=1;i<=100;i++){
        	if(i%2==0){//ż����
        		sum+=i;
        	}	
        	}
        	System.out.println(sum);
        }
        /*�ֱ����1-100֮���ż���ͺ�������*/
        public static void test6(){
        	int sum1=0;//ż��
        	int sum2=0;//����
        	for(int i=1;i<=100;i++){
        		if(i%2==0){
        			sum1+=i;
        		}else{
        			sum2+=i;
        		}
        	}
        	System.out.println("ż���ͣ� "+sum1);
        	System.out.println("�����ͣ� "+sum2);
        }
        /*forѭ�����A-Z��ÿ����ʾ5�� ��ĸ*/
        public static void test7(){
        	     int s=0;
        		for(char a='A';a<='Z';a++){
        			System.out.print(a +"\t");//\t��ʾ�ո�
        			s++;
        			if(s%5==0){
        				System.out.println();
        			}
        			
        		}
        		
        }
        /*A��B��ȡֵ��0-9������A+B=12�ķ���*/
        public static void test8(){
        	for(int A=0;A<=9;A++){
        		for(int B=0;B<=9;B++){
        		if(A+B==12)
        			System.out.println(A+"+"+B+"="+"12");
        		}
        	}
        }
        /*forѭ�������žų˷���*/
        public static void test9(){
        	for(int i=1;i<=9;i++){
        		for(int j=1;j<=i;j++){
        		System.out.print(j+"*"+i+"="+i*j+"\t");
        	}
        	System.out.println();
        	}
        }
       /* ���a+aa+aaa+aaaa+aaaaa��ֵ������a��һ�����֡�*/
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
        	System.out.println("����һ������0-9");
        	Scanner sc=new Scanner(System.in);
        	int a=sc.nextInt();
        	System.out.println("�����������ظ�����");
        	int b=sc.nextInt();
        	int s=0;
        	System.out.println("a="+a+";b="+b);
        	for(int i=b;i>0;i--){
        		s+=i*a*Math.pow(10, (b-i));
        	}
        	System.out.println("s="+s);
        }
}

 
