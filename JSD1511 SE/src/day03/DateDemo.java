package day03;
import java.util.Date;
/*
 * java.util.Date
 * �����ڲ�ά��һ��longֵ����ֵ��ʾ��1970��Ԫ������������ʱ��֮�侭���ĺ����
 * ����Date���û�п���ʱ�������Ҵ����⡱ǧ��桰�����⣬����ʹ��Date������ʾ
 * һ��ʱ�䣬������ʹ��������ʱ����м���
 */
public class DateDemo {
	public static void main(String[] args) {
//		long lmax=Long.MAX_VALUE;
//		long year=lmax/1000/60/60/24/365;
//		year+=1970;
//		System.out.println(year);
		//Ĭ�ϴ���������ʾ����ϵͳʱ��
		Date now=new Date();
		//Date��д��toString���Է�Ӣ����������Ѻ�
		System.out.println(now);
		/*
		 * Date��Ϊ�������ȱ�ݣ����Դ󲿷ֲ���ʱ��ķ���
		 * ��������Ϊ��ʱ�ģ����ٽ���ʹ��
		 */
		now.getYear();
		/*
		 * long getTime()
		 * ��ȡDate�ڲ�ά����longֵ
		 */
		long time=now.getTime();
		System.out.println("time:"+time);
		//����ĵ�ǰʱ��
		time+=1000*60*60*24;
		now.setTime(time);
		System.out.println(now);
	}
}
