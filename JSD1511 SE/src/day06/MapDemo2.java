package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * boolean containsKey(K k)
 * 判断当前Map是否包含给定的key
 * 判断标准还是依靠eqauls方法的比较结果
 * 
 * boolean continsValue(V v)
 * 是否包含给定的value，用的相对较少
 * @author Administrator
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文",98);
		map.put("数学",97);
		map.put("英语",96);
		map.put("物理",95);
		map.put("化学",98);
		System.out.println(map);
		boolean containsKey=map.containsKey("语文");
		System.out.println(containsKey);
		boolean containsValue=map.containsValue(98);
		System.out.println(containsValue);
	}
}
