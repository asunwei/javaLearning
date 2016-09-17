package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * 查找表，以key-value对的形式存储元素
 * 其中key在Map中不允许重复(equals比较）
 * 常用实现类有HashMap（散列表，使用散列表算法实现）
 * HashMap的查找性能比数组强很多
 * @author Administrator
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		//Map可以分别定制Key和Map
		Map<String,Integer> map=new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * 将指定的key和value存入map中
		 * 由于Map中的key不允许重复，所以若使用
		 * key存入一个value则会将该有的key对应的evalue值替换，
		 * 并将别替换的value值返回，若使用新的key，则返回null
		 */
		Integer num=map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 98);
		System.out.println(map);
		System.out.println(num);
		num=map.put("语文", 99);
		System.out.println(map);
		System.out.println(num);
		/*
		 * v get(K k)
		 * 根据给定的key值获取对应的value
		 * 若给定的key在Map中不存在，则返回null
		 */
		num=map.get("政治");
		System.out.println(num);
		num=map.get("英语");
		System.out.println(num);
		/*
		 * v remove(K k)
		 * 根据给定的key从Map中删除对应的这组
		 * 键值对。而返回值则是该key对应的value
		 */
		System.out.println("删除英语...");
		Integer old=map.remove("英语");
		System.out.println(old);
		System.out.println(map);
		System.out.println();
	}
}
