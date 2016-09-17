package day05;
//1+1/2+1/3…+1/n（n>=2）。要求使用交互的方式计算此数列的和：用户在控制台
//录入需要计算的整数 n 的值，程序计算此数列的和，并在控制台输出结果。
import java.util.Scanner;
public class Lianxi_04_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入n的值：");
		int n=scan.nextInt();
		double result=0;
		for(int i=1;i<=n;i++){
			result+=1.0/i;
		}
			System.out.println(result);
	}

}
