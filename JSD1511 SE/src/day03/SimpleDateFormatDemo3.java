package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 * Ҫ���û�����yyyy-MM-dd��������
 * Ȼ����򾭹�������������������Ϊֹ
 * һ�����˶�����
 */

public class SimpleDateFormatDemo3 {
	public static void main(String[] args) throws ParseException {
		/*
		 * ˼·
		 * �����������ת��Ϊһ��Date���ڱ�ʾ
		 * �ڴ���һ��Date��ʾ�ĵ�ǰϵͳʱ��
		 * ��ǰϵͳʱ���Ӧ�ĺ���ֵ
		 * ��ȥ���յĺ���ֵ
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("������������գ�");
		String str=scan.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//��Date-->String
		Date birth=sdf.parse(str);//String-->Date
		Date now=new Date();
		long time=now.getTime()-birth.getTime();
		time=time/1000/24/60/60;
		System.out.println("���˶����죺"+time);
		
	}
}
