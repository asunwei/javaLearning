package day03;

import java.util.Calendar;

/*
 * Calendar�ṩ��һ���������ڻ�ȡ��ָ����ʱ�������ʱ�䵥λ������Ӧ��ֵ
 * 
 * int get(int field)
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		//��������
		Calendar calendar=Calendar.getInstance();
		//��ȡ��
		int year=calendar.get(Calendar.YEAR);
		System.out.println(year);
		//��ȡ�� �����¿�ʼ
		int month=calendar.get(calendar.MONTH);
		System.out.println(month+1);
		//��ȡ��
		int day=calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(day);
		//�����ǽ���ĵڼ���
		int days=calendar.get(calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ����"+days+"��");
		//�������ܼ�
		int dow=calendar.get(calendar.DAY_OF_WEEK);
		String[] arr={"��","һ","��","��","��","��","��"};
		System.out.println("��"+arr[dow-1]);
		
		
		
		
	}
}
