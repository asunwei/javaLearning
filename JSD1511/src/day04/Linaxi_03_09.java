package day04;
import java.util.Scanner;
public class Linaxi_03_09 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("�������Ʒ���ۣ�");
		double price=scan.nextDouble();
		System.out.println("�������Ʒ������");
		double mount=scan.nextDouble();
		System.out.println("�������");
		double money=scan.nextDouble();
		double totalPrice=price*mount;
		if(totalPrice>=499){
			totalPrice-=100;
		}
		if(totalPrice<=money){
			double change=money-totalPrice;
			System.out.println("ʵ�ս��Ϊ����"+totalPrice+"������"+change);
		}else{
			System.out.println("ERROR!������Ǯ����!");
		}
	}

}
