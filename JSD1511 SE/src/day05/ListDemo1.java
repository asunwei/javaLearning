package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List 集合
 * 可重复性 且有序
 * 特点：可通过下标操作元素，与数组相似
 * @author Administrator
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * E get(int index)
		 * 
		 * 获取指定下标对应的元素
		 * 类似于数组元素的功能：array[i];
		 * 
		 */
		String str=list.get(1);
		System.out.println(str);
		/*
		 * 使用传统的循环遍历
		 */
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
		/*
		 * 使用新循环遍历
		 */
		for(String str1:list){
			System.out.println(str1);
		}
		/*
		 * E set(int index,E e)
		 * 将给定的元素设置到指定的位置上，返回值为原位置上
		 * 的元素，替换元素操作
		 * 
		 * [one,two, three,four]
		 */
		System.out.println(list);
		String old =list.set(1, "2");
		System.out.println(list);
		System.out.println("old"+old);
	}
}
