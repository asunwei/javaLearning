package day03;
import java.util.Calendar;
import java.util.Date;
/*
 * java.util.Calendar
 * ������
 * ���ڲ���ʱ���API
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ�����������������
		 * GregorianCalendar
		 * Ĭ�ϵ�ǰϵͳʱ��
		 */
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendarde��toString����ֱ�۵ķ�Ӧ����ʱ������
		 */
		System.out.println(calendar);
		/*
		 * Calendar�ṩ����Date֮�以ת����ط���
		 * Calendar-->Date
		 * Date getTime()����
		 * �÷����᷵��һ��Date���󣬸ö����ʾ��ʱ����ǵ�ǰCalender��ʾ��ʱ��
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * Date-->Calendar
		 * void setTime(Date date)
		 * �÷�������ǰCalendar��ʾ������Date����ʾ��ʱ��
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}
}
