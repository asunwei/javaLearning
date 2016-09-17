package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一个重载的add，remove方法
 * @author Administrator
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * void add(int index,E e)
		 * 将指定的元素“插入”到指定的位置,原位置及后序元素按顺序
		 * 往后移动
		 * 
		 * [one,two,2,three,four]
		 */
		list.add(2, "2");
		System.out.println(list);
		/*
		 * E remove(int index)
		 * 删除当期集合中给定位置的元素，并将删除的元素返回
		 * 
		 * [one,two,2 four]
		 */
		String old=list.remove(3);
		System.out.println(list);
		System.out.println("old:"+old);
		/*
		 * 循环删除元素时候，要倒着删除
		 * 否则下标在长，而size在减
		 */
		for(int i=list.size()-1;i>=0;i--){
			list.remove(i);
		}
		System.out.println("删除完毕");
		System.out.println(list);
	}
}
