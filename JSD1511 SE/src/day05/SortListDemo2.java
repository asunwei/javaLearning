package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections排序含有自定义元素的List集合
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
		 * 若希望用sort方法进行排序，要求集合中的元素必须实现
		 * Comparable接口,并重写compareTo方法来定义比较规则
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
