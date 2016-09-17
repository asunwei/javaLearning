package day04;
import java.util.Scanner;
public class Linaxi_03_09 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入产品单价：");
		double price=scan.nextDouble();
		System.out.println("请输入产品数量：");
		double mount=scan.nextDouble();
		System.out.println("请输入金额：");
		double money=scan.nextDouble();
		double totalPrice=price*mount;
		if(totalPrice>=499){
			totalPrice-=100;
		}
		if(totalPrice<=money){
			double change=money-totalPrice;
			System.out.println("实收金额为：￥"+totalPrice+"，找零"+change);
		}else{
			System.out.println("ERROR!您给的钱不够!");
		}
	}

}
