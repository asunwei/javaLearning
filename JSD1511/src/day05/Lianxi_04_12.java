package day05;
/*	请找出1000到2000之间，可以被3整除的数，并输出  
要求: for结构与while结构两种方式实现*/
//import java.util.Scanner;
public class Lianxi_04_12 {
		   public static void main(String[] args) {      
			   for(int i=0,j=0,k=0;i<10&&j<4&&k<10;j+=2){        
				   System.out.println(i++);    
				   System.out.println(++k+i);    
				   }    
			   }
		/*Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		System.out.println("猜吧");
		int guess=scan.nextInt();
		while(guess!=num){
			if(guess==-1){
				break;
			}
			if(guess>num){
				System.out.println("猜大了");
			}else{
				System.out.println("猜小了");
			}
			System.out.println("猜吧");
			guess=scan.nextInt();
		}
		if(guess==num){
			System.out.println("猜对了");
		}else{
			System.out.println("再见");
		}*/
		
		/*System.out.println("能被3整除的数有：");
		int i=1000;
		while(i<2000){
			if(i%3==0){
			System.out.println(i);
			}
			i++;
		}*/
		/*for(int i=1000;i<=2000;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}*/
	

	}


