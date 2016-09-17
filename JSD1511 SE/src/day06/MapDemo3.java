package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Map的遍历
 * Map遍历有三种方式
 * 1：遍历所有的key
 * 2：遍历所有的key-value对
 * 3：遍历所有的Value（相对而言不常用）
 * @author Administrator
 *
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文",98);
		map.put("数学",97);
		map.put("英语",96);
		map.put("物理",95);
		map.put("化学",98);
		/*
		 * 遍历所有key
		 * 
		 * Set<k> keySet()
		 * 将当前Map中所有key存到一个Set集合中
		 * 并将该集合返回
		 */
		Set<String> setKey=map.keySet();
		for(String set:setKey){
			System.out.println("set:"+set);
		}
			
			/*
			 * 遍历每一组键值对
			 * Entry是Map的内部类，其每一个实例用于
			 * 表示一组键值对。有key，value两个主要属性组成
			 * 
			 * Set<Entry<K,V>> entrySet()
			 */
			Set<Entry<String,Integer>> entrySet=map.entrySet();
			for(Entry<String,Integer> entry:entrySet){
				String key=entry.getKey();
				Integer value=entry.getValue();
				System.out.println(key+":"+value);
			}
			/*
			 * Collection<V> values()
			 * 将当前Map中所有的value存入到集合中
			 * 然后返回该集合
			 */
			Collection<Integer> values=map.values();
			for(Integer value:values){
				System.out.println("value:"+value);
			}
	}
}
