package day04;
import java.util.Scanner;
public class Linaxi_03_08 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������������������a��b��c���м��ÿո������");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("������Ϊ��"+max);
	}

}
