package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

/*
 * �����û�������������ںͱ�����
 * ���㱣����ǰ14�����ڵ�����Ϊ������
 */
public class CalendarDemo2 {
	/*����:
		 *  1:����Scanner���ڻ�ȡ�û�����
		 *  2:�ֱ�Ҫ���û������������ںͱ�����
		 *  3:����SimpleDateFormat
		 *  4:����������ת��ΪDate
		 *  5:����һ��Calendar��������������
		 *    ���ú�
		 *  6:���������
		 *  7:�ټ�������յ�ǰ����
		 *  8:����Ϊ���ܵ�����
		 *  9:ͨ��Calendarת��ΪDate
		 *  10:��Dateת��Ϊ�ַ��������  
	 */
	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������������ڣ�yyyy-MM-dd��:");
		String dateStr=scan.nextLine();
		System.out.println("�����뱣����������");
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
		System.out.println("������Ϊ��"+dateStr);
		
	}
}


