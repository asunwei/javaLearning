package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合和map转换为线程安全的
 * @author Administrator
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		/*
		 * List常用的实现类：ArrayList和LinkedList都不是线程安全的
		 */
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * 使用Collections的静态方法可以将
		 * 现有的List集合转换为线程安全的
		 */
		list =Collections.synchronizedList(list);
		System.out.println(list);
		
		/*
		 * HashSet(list)相当于addAll list的所有元素
		 */
		Set<String> set=new HashSet<String>(list);
		/*
		 * 转换为线程安全的set集合
		 */
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		
		Map<String ,Integer> map=new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		/*
		 * HashMap也不是线程安全的
		 */
		map=Collections.synchronizedMap(map);
		System.out.println(map);
	}
}








