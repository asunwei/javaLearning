package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取List集合中的子集
 * @author Administrator
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * List<E> subList(int start,int end)
		 * 截取当前字符串指定范围内的元素获取子字符串
		 * [3,4,5,6,7]
		 */
		List<Integer> subList=list.subList(3, 8);
		System.out.println("sub"+subList);
		/*
		 * 子集每个元素扩大10倍
		 */
		for(int i=0;i<subList.size();i++){
			Integer num=subList.get(i);
			num=num*10;
			subList.set(i, num);			
		}
		System.out.println(subList);
		System.out.println(list);
		/*
		 * 删除3-7的元素
		 */
		list.subList(3, 8).clear();
		System.out.println(list);
	} 
}
