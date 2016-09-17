package day05;
import java.util.Scanner;
public class b {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入范围");
		int a=scan.nextInt();
		int num;
		int count=0;
		for(num=2;num<a;num++){
			boolean flag=true;
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(num+"\t");
				count++;
				if(count%10==0){
					System.out.println();
					
				}
			}
		}
		System.out.println();
		System.out.println("质数的个数是："+count);
	}
}
