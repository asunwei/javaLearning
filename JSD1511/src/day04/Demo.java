package day04;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*1000+1);
        int guess=0;
        do{
        	System.out.println("请输入一个数：");
        	guess=scan.nextInt();
        	if(guess==0){
        		break;
        	}
        	if(guess>num){
        		System.out.println("猜大了");
        	}else if(guess<num){
        		System.out.println("猜小了");
        	}
        }while(guess!=num);
        if (guess==num){
        	System.out.println("恭喜你，猜对了！");
        }else{
        	System.out.println("下次再来！");
        }
	}

}
