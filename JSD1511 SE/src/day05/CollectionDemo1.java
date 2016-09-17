package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中的作用是用来约束集合中的元素类型
 * @author Administrator
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {//Collection是接口
		Collection <String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		//新循环方式
		for(String str:c){
			System.out.println(str);
		}
		//迭代器方式
		/*
		 * 迭代器的泛型是什么取决于集合中定义的泛型类型，一致即可
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println(0x122/2);
	}
}