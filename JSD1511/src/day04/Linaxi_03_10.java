package day04;
import java.util.Scanner;
public class Linaxi_03_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ʾ��1.�빺�� 2.�������3.��ӭ�´ι���");
		int a=scan.nextInt();
		switch (a){
		case 1:
			System.out.println("�빺��");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("��ӭ�´ι���");
			break;
		default:
			System.out.println("�������");
		}
	}

}
