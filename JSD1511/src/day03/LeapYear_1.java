package day03;
//闰年的判断
import java.util.Scanner;
public class LeapYear_1 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("请输入年份:");
    int year=scan.nextInt();
    boolean flag=year%4==0&&year%100!=0
              ||year%400==0;
    String str=flag?year+"是闰年":year+"不是闰年";
    System.out.println(str);		
    
}
}