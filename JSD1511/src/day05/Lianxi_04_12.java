package day05;
/*	���ҳ�1000��2000֮�䣬���Ա�3���������������  
Ҫ��: for�ṹ��while�ṹ���ַ�ʽʵ��*/
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
		System.out.println("�°�");
		int guess=scan.nextInt();
		while(guess!=num){
			if(guess==-1){
				break;
			}
			if(guess>num){
				System.out.println("�´���");
			}else{
				System.out.println("��С��");
			}
			System.out.println("�°�");
			guess=scan.nextInt();
		}
		if(guess==num){
			System.out.println("�¶���");
		}else{
			System.out.println("�ټ�");
		}*/
		
		/*System.out.println("�ܱ�3���������У�");
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


