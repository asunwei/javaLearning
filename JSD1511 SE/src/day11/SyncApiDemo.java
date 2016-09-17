package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����Ϻ�mapת��Ϊ�̰߳�ȫ��
 * @author Administrator
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		/*
		 * List���õ�ʵ���ࣺArrayList��LinkedList�������̰߳�ȫ��
		 */
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * ʹ��Collections�ľ�̬�������Խ�
		 * ���е�List����ת��Ϊ�̰߳�ȫ��
		 */
		list =Collections.synchronizedList(list);
		System.out.println(list);
		
		/*
		 * HashSet(list)�൱��addAll list������Ԫ��
		 */
		Set<String> set=new HashSet<String>(list);
		/*
		 * ת��Ϊ�̰߳�ȫ��set����
		 */
		set=Collections.synchronizedSet(set);
		System.out.println(set);
		
		Map<String ,Integer> map=new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		/*
		 * HashMapҲ�����̰߳�ȫ��
		 */
		map=Collections.synchronizedMap(map);
		System.out.println(map);
	}
}








