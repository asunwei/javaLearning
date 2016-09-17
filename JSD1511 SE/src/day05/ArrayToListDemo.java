package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 从数组转为集合
 * 需要注意，只能转换为List集合、
 * 使用数组的工具类Arrays的静态方法asList来实现（List里可以存放重复元素）
 * @author Administrator
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array ={"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		list.set(0, "1");
		System.out.println(list);
		//修改集合元素就是修改数组对应的元素
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		//数组转换的集合不允许添加新元素
		//list.add("five");
		/*
		 * 若有修改元素数量需求时，可以自行创建一个集合
		 */
		List<String> list1=new ArrayList<String>(list);
		//list1.addAll(list); 
		list1.add("five");
		System.out.println(list1);
		
		Set<String> set= new HashSet<String>(list1);
		System.out.println(set);
		
	}
	
}
