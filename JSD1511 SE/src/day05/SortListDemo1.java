package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Collections�Ǽ��ϵĹ�����
 * �ṩ�˱��ڲ������ϵ���ؾ�̬����
 * sort�������ڶ�List���Ͻ�����Ȼ����
 * @author Administrator
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<10;i++){
			list.add(ran.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
