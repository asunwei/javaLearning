package day03;

import java.util.Calendar;

/*
 * ��ȡ����ʱ���������������ֵ
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * �����ܹ������죿
		 */
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("�����ܹ�"+days+"��");
		/*
		 * �����ܹ�������
		 */
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("�����ܹ�"+days+"��");
	}
}
