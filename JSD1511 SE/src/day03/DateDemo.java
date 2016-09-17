package day03;
import java.util.Date;
/*
 * java.util.Date
 * 该类内部维护一个long值，该值表示从1970年元旦到所描述的时间之间经过的毫秒差
 * 由于Date设计没有考虑时区，并且存在这”千年虫“的问题，所以使用Date仅仅表示
 * 一个时间，而不会使用它来对时间进行计算
 */
public class DateDemo {
	public static void main(String[] args) {
//		long lmax=Long.MAX_VALUE;
//		long year=lmax/1000/60/60/24/365;
//		year+=1970;
//		System.out.println(year);
		//默认创建出来表示当期系统时间
		Date now=new Date();
		//Date重写了toString，对非英语地区不够友好
		System.out.println(now);
		/*
		 * Date因为存在设计缺陷，所以大部分操作时间的方法
		 * 都被声明为过时的，不再建议使用
		 */
		now.getYear();
		/*
		 * long getTime()
		 * 获取Date内部维护的long值
		 */
		long time=now.getTime();
		System.out.println("time:"+time);
		//明天的当前时间
		time+=1000*60*60*24;
		now.setTime(time);
		System.out.println(now);
	}
}
