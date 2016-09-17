package day03;
import java.util.Scanner;
public class Cashier_1 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入单价（￥）：");
		double price=scan.nextDouble();
		System.out.println("请输入数量：");
		double mount=scan.nextDouble();
		System.out.println("请输入金额（￥）：");
		double money=scan.nextDouble();
		double totalPrice=price*mount;
		if(totalPrice>=500){
			totalPrice*=0.8;
		}
		if(money>=totalPrice){
			double chage=money-totalPrice;
			System.out.print("应收金额为：￥"+totalPrice+"，找零为：￥"+chage);
		}else{
			System.out.println("ERROR！您给的钱不够！");
		}
		
		
	}

}
