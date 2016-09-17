package day03;
import java.util.Calendar;
import java.util.Date;
/*
 * java.util.Calendar
 * 日历类
 * 用于操作时间的API
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * 默认创建出来的阳历历法
		 * GregorianCalendar
		 * 默认当前系统时间
		 */
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendarde的toString不能直观的反应具体时间日期
		 */
		System.out.println(calendar);
		/*
		 * Calendar提供了与Date之间互转的相关方法
		 * Calendar-->Date
		 * Date getTime()方法
		 * 该方法会返回一个Date对象，该对象表示的时间就是当前Calender表示的时间
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * Date-->Calendar
		 * void setTime(Date date)
		 * 该方法允许当前Calendar表示给定的Date所表示的时间
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}
}
