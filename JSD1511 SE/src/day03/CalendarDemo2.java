package day03;

import java.util.Calendar;

/*
 * Calendar提供了一个方法用于获取所指定的时间分量（时间单位）所对应的值
 * 
 * int get(int field)
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		//当期日期
		Calendar calendar=Calendar.getInstance();
		//获取年
		int year=calendar.get(Calendar.YEAR);
		System.out.println(year);
		//获取月 从零月开始
		int month=calendar.get(calendar.MONTH);
		System.out.println(month+1);
		//获取日
		int day=calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(day);
		//今天是今年的第几天
		int days=calendar.get(calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的"+days+"天");
		//今天是周几
		int dow=calendar.get(calendar.DAY_OF_WEEK);
		String[] arr={"日","一","二","三","四","五","六"};
		System.out.println("周"+arr[dow-1]);
		
		
		
		
	}
}
