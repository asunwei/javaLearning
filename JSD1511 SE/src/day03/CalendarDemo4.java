package day03;

import java.util.Calendar;

/*
 * ���ݲ�ͬ��ʱ������ֱ����ò�ͬ��ֵ
 * �ǵ�Calerder��ʾʱ��
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * ��Calendar����Ϊ2008-08-08 20��08��08
		 */
		//������
		calendar.set(Calendar.YEAR,2008);
		//������
		calendar.set(Calendar.MONTH, 7);
		//������
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		//����Сʱ
		calendar.set(Calendar.HOUR, 20);
		//���÷���
		calendar.set(Calendar.MINUTE, 8);
		//������
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
		//08���ܹ��ж�����
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		int month=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("08���ܹ���"+days+"��");
		System.out.println(month);
	}
}
