package day04;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*1000+1);
        int guess=0;
        do{
        	System.out.println("������һ������");
        	guess=scan.nextInt();
        	if(guess==0){
        		break;
        	}
        	if(guess>num){
        		System.out.println("�´���");
        	}else if(guess<num){
        		System.out.println("��С��");
        	}
        }while(guess!=num);
        if (guess==num){
        	System.out.println("��ϲ�㣬�¶��ˣ�");
        }else{
        	System.out.println("�´�������");
        }
	}

}
