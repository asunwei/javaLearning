package day03;
import java.util.Scanner;
//年龄判断程序
public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = scan.nextInt();
		
		//输出age是否在18到50之间
		System.out.println(age>=18 && age<=50);
	}
}













