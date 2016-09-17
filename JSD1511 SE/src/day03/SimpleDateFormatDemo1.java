package day03;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * java.text. SimpleDateFormat
 * 该类的作用是可以按照一个指定的日期格式
 * 将Date与String之间相互转换
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
		 * 将给定的Date按照指定好的日期格式转换为字符串
		 */
		String str=sdf.format(now);
		System.out.println(str);
	}
}
