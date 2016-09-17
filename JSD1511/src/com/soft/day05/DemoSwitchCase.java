package com.soft.day05;

public class DemoSwitchCase {

	/**
	 * 分支流程控制语句switchase
	 */
	public static void main(String[] args) {
		test(50);
	}
    public static void test(int score){
    	score=score/10;
    	switch(score){
    	case 10:
    	case 9:
    		System.out.println("A");
    		break;
    	case 8:
    		System.out.println("B");
    		break;
    	case 7:
    		System.out.println("C");
    		break;
    	case 6:
    		System.out.println("D");
            break;
    	default:
    	    System.out.println("E");
    	    break;
    	
    	}
    }
    
}
 