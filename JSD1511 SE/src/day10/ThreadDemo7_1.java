package day10;
/**
 * ������ʱ��
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDemo7_1 {
	public static void main(String[] args) {
		while(true){
			SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:ss");
			//��Date��ʽת��ΪString��ʽ
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
