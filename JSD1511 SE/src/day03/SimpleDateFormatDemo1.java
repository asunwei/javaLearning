package day03;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * java.text. SimpleDateFormat
 * ����������ǿ��԰���һ��ָ�������ڸ�ʽ
 * ��Date��String֮���໥ת��
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		/*
		 * Date-->String
		 */
		Date now=new Date();
		/*
		 * 2015-12-23 14:50:30
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		/*
		 * String format(Date date)
		 * ��������Date����ָ���õ����ڸ�ʽת��Ϊ�ַ���
		 */
		String str=sdf.format(now);
		System.out.println(str);
	}
}
