package day04;
import java.util.Scanner;
public class Linaxi_03_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入提示：1.请购物 2.购物结算3.欢迎下次光临");
		int a=scan.nextInt();
		switch (a){
		case 1:
			System.out.println("请购物");
			break;
		case 2:
			System.out.println("购物结算");
			break;
		case 3:
			System.out.println("欢迎下次光临");
			break;
		default:
			System.out.println("输入错误");
		}
	}

}
