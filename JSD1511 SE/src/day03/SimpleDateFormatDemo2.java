package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * String->Date
 * 
 * 使用SimpleDateFormat将一个字符串按照指定的日期格式解析为
 * 一个Date对象
 * Date parse(String str)
 */

public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String str="2008-08-08 20:08:00";
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		Date date=sdf.parse(str);
		System.out.println(date);
	}
}
