package day04;
//判断月份，年份天数
import java.util.Scanner;
public class Linaxi_03_07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=scan.nextInt();
		System.out.println("请输入月份：");
		int month=scan.nextInt();
		int day=0;
		if (year<0||(month<=0||month>12)){
			System.out.println("您输入的有误");
		}else{
			switch(month){
			case 2:
				if((year%4==0&&year%100!=0)||year%400==0){
					day=29;
				}else{
					day=28;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			   day=31;
			break;
			default:
				day=30;
			}
			System.out.println(year+"年"+month+"月"+day+"天");
		}
	}

}
