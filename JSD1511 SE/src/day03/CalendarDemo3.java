package day03;

import java.util.Calendar;

/*
 * 获取给定时间分量所允许的最大值
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * 今年总共多少天？
		 */
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年总共"+days+"天");
		/*
		 * 当月总共多少天
		 */
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("当月总共"+days+"天");
	}
}
