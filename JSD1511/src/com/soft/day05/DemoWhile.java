package com.soft.day05;

public class DemoWhile {
	/**
	 * ѭ�����
	 */
	public static void main(String[] args) {
    //test();
    //test1();
    test2();
	}
    public static void test(){
    	int a=0;//�������a
    	//��aС��5��ִ��whileѭ����
    	while(a<5){//ѭ���ķ�Χ����<5����
    		System.out.println(a);//0��1��2��3��4��
    		a++;
    	}
    	System.out.println("����ѭ��");
    } 
    public static void test1(){
    	int i=0;
    	while(i<25){
    		System.out.print(i++ +" ");//ln��ʾ���������û��ln��ʾͬһ�����
    		if(i%7==0){
    			System.out.println();//�յ��������ʾ����
    		}
    	}
    	System.out.println("ѭ������");
    }
   //do-while
    public static void test2(){
    	int i=1;
    	//��ִ��do�������������Ȼ�����ж�while����
    	do{
    		System.out.println(i);
    		i++;
    	}while(i<=10);
    }
}
