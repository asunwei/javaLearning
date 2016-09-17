package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

/*
 * 根据用户输入的生产日期和保质期
 * 计算保质期前14天所在的周三为促销日
 */
public class CalendarDemo2 {
	/*步骤:
		 *  1:创建Scanner用于获取用户输入
		 *  2:分别要求用户输入生产日期和保质期
		 *  3:创建SimpleDateFormat
		 *  4:将生产日期转换为Date
		 *  5:创建一个Calendar，并将生产日期
		 *    设置好
		 *  6:计算过期日
		 *  7:再计算过期日的前两周
		 *  8:设置为那周的周三
		 *  9:通过Calendar转换为Date
		 *  10:将Date转换为字符串并输出  
	 */
	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入生产日期（yyyy-MM-dd）:");
		String dateStr=scan.nextLine();
		System.out.println("请输入保质期天数：");
		String dayStr=scan.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);//String-->Date
		int day=Integer.parseInt(dayStr);//Interger-->int
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);//Date-->Calendar
		calendar.add(Calendar.DAY_OF_YEAR, day);
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		date=calendar.getTime();//Calendar-->Date
		//System.out.println(calendar.getTime());
		dateStr=sdf.format(date);//Date-->String
		System.out.println("促销日为："+dateStr);
		
	}
}


