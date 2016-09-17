package daytwo;

import java.util.Date;

public class DateDemo1 {
	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		long time=now.getTime();
		System.out.println(time);
		time+=1000*24*60*60;
		now.setTime(time);
		System.out.println(now);
		
	}
}
