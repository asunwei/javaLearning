package day02;
import java.util.Scanner; //1.
//Scanner����ʾ
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //2.
		System.out.println("����������:");
		int age = scan.nextInt(); //3.�����û����������
		System.out.println("�����뵥��:");
		double price = scan.nextDouble();
		
		System.out.println(age);
		System.out.println(price);
	}
}













