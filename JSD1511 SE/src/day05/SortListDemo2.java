package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ʹ��Collections�������Զ���Ԫ�ص�List����
 * @author Administrator
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list =new ArrayList<Point>();
		list.add(new Point(5,6));
		list.add(new Point(1,7));
		list.add(new Point(2,3));
		list.add(new Point(7,2));
		System.out.println(list);
		/*
		 * ��ϣ����sort������������Ҫ�󼯺��е�Ԫ�ر���ʵ��
		 * Comparable�ӿ�,����дcompareTo����������ȽϹ���
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
