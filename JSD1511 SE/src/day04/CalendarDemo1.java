package day04;

import java.util.Calendar;

/*
 * Calendar�����ṩ�˼���ʱ��ķ���
 * ��ָ����ʱ������ۼ�ָ����ֵ
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//����5�����Ժ�
		calendar.add(Calendar.MONTH, 5);
		System.out.println(calendar.getTime());
		//����21���Ժ�
		calendar.add(Calendar.DAY_OF_YEAR, 21);
		System.out.println(calendar.getTime());
		//��������ǰ
		calendar.add(Calendar.YEAR, -2);
		System.out.println(calendar.getTime());
	}

}
