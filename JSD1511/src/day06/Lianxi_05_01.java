package day06;
import java.util.Scanner;
public class Lianxi_05_01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ�������ķ�Χ��2~");
		int a=scan.nextInt();
		int count=0;
		int num;
		for(num=2;num<=a;num++){
			boolean flag=true;//1.��������
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					flag=false;//2.��ʾ��������
					break;
			     }
			}	
			if(flag){//3.�еý���,flagΪboolean����
				count++;
				System.out.print(num+"\t");
				if(count%10==0){
					System.out.println();
				}
			}
			
		}
		System.out.println();
		System.out.println("���������"+count+"��");
	}

}
