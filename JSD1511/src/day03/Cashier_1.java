package day03;
import java.util.Scanner;
public class Cashier_1 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�����뵥�ۣ�������");
		double price=scan.nextDouble();
		System.out.println("������������");
		double mount=scan.nextDouble();
		System.out.println("�������������");
		double money=scan.nextDouble();
		double totalPrice=price*mount;
		if(totalPrice>=500){
			totalPrice*=0.8;
		}
		if(money>=totalPrice){
			double chage=money-totalPrice;
			System.out.print("Ӧ�ս��Ϊ����"+totalPrice+"������Ϊ����"+chage);
		}else{
			System.out.println("ERROR��������Ǯ������");
		}
		
		
	}

}
