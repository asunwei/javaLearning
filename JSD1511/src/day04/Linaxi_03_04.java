package day04;
import java.util.Scanner;
public class Linaxi_03_04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������������������:a��b��c���Կո������");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("��������ǣ�");
		System.out.println("a="+a+"��b="+b+"��c="+c);
		int temp=0;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("�������к���Ϊ��");
		System.out.println("a="+a+"��b="+b+"��c="+c);
	}

}
