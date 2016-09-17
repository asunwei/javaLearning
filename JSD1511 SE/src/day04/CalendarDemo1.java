package day04;

import java.util.Calendar;

/*
 * Calendar用与提供了计算时间的方法
 * 对指定的时间分量累加指定的值
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//计算5个月以后
		calendar.add(Calendar.MONTH, 5);
		System.out.println(calendar.getTime());
		//计算21天以后
		calendar.add(Calendar.DAY_OF_YEAR, 21);
		System.out.println(calendar.getTime());
		//计算两年前
		calendar.add(Calendar.YEAR, -2);
		System.out.println(calendar.getTime());
	}

}
