package com.soft.day05;

public class DemoTt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//test();
		test1();
	}
    public static void test(){
    	int s=0;
    	for (char a='A';a<='Z';a++){
    		System.out.print(a+"\t");
    		s++;
    		if(s%5==0){
    			System.out.println();
    		}
    	}
    	
    }
    public static void test1(){
    	for(int i=1;i<=9;i++){
    		for(int t=1;t<=i;t++){
    			System.out.print(t+"*"+i+"="+i*t+"\t");
    			if(i<=t){
    				System.out.println();
    			}
    			
    		}
    	}
    }
}
