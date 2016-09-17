package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 * 要求用户按照yyyy-MM-dd输入生日
 * 然后程序经过处理后最终输出到今天为止
 * 一共活了多少天
 */

public class SimpleDateFormatDemo3 {
	public static void main(String[] args) throws ParseException {
		/*
		 * 思路
		 * 将输入的日期转换为一个Date日期表示
		 * 在创建一个Date表示的当前系统时间
		 * 当前系统时间对应的毫秒值
		 * 减去生日的毫秒值
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入你的生日：");
		String str=scan.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//将Date-->String
		Date birth=sdf.parse(str);//String-->Date
		Date now=new Date();
		long time=now.getTime()-birth.getTime();
		time=time/1000/24/60/60;
		System.out.println("活了多少天："+time);
		
	}
}
