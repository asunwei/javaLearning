package day03;
import java.util.Scanner;
//�����жϳ���
public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:");
		int age = scan.nextInt();
		
		//���age�Ƿ���18��50֮��
		System.out.println(age>=18 && age<=50);
	}
}













