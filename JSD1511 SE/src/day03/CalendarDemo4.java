package day03;

import java.util.Calendar;

/*
 * 根据不同的时间分量分别设置不同的值
 * 是的Calerder表示时间
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 将Calendar设置为2008-08-08 20：08：08
		 */
		//设置年
		calendar.set(Calendar.YEAR,2008);
		//设置月
		calendar.set(Calendar.MONTH, 7);
		//设置日
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		//设置小时
		calendar.set(Calendar.HOUR, 20);
		//设置分钟
		calendar.set(Calendar.MINUTE, 8);
		//设置秒
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		//08年总共有多少天
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		int month=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("08年总共有"+days+"天");
		System.out.println(month);
	}
}
