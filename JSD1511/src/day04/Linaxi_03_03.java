package day04;
import java.util.Scanner;
public class Linaxi_03_03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请依次输入两个数：a，b（以空格隔开）");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max=a>b?a:b;
		System.out.println("最大的数为"+max);
			}

}
