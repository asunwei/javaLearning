package com.soft.day04;

import java.util.Scanner;

public class DemoTest {

	
	public static void main(String[] args) {
		
    test();
	//System.out.println(test1(5));
		//test2;
	}
	/*������������x,y,z,������������С�������*/
   public static void test(){
   Scanner sc=new Scanner(System.in);
   System.out.println("������������x y z��");
   int x=sc.nextInt(); 
   int y=sc.nextInt();
   int z=sc.nextInt();
   if(x<=y&&y<=z){
	   System.out.println("x="+x+"y="+y+"z="+z);
   }else if(x<=z&&z<=y){
	   System.out.println("x="+x+"z="+z+"y="+y);
   }else if(y<=x&&x<=z){
	   System.out.println("y="+y+"x="+x+"z="+z);
   }else if(y<=z&&z<=x){
	   System.out.println("y="+y+"z"+z+"x="+x);
   }else if(z<=x&&x<=y){
	   System.out.println("z="+z+"x="+x+"y="+y);
   }else{
	   System.out.println("z="+z+"y="+y+"x="+x);
   }
   
   }
   /*�ڿ���̨����һ�������ж�����������ż��*/
   public static int test1(int n){
	   if(n%2!=0){
		   return 1;
	   } else{
		   return 2;
	   }
   }
  /* ���1-100֮���ż����*/
   

      /*public static void  test2();
      int i=1;
      int sum=0;
      if(i>=100){
    	  print
      }else if{
    	  i=i+1;
    	  sum=sum+i;
      }*/
}
      