package daytwo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDEmo5 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		Date date=new Date();
//		calendar.setTime(date);
		date=calendar.getTime();
		System.out.println(date);
	}
	
	
}
