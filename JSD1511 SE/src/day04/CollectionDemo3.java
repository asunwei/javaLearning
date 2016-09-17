package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/*
 * 集合还提供了用于删除元素的方法
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("one");
		System.out.println("c:"+c);
		/*
		 * boolean remove(E e)
		 * 删除当前集合指定的元素，成功删除返回true
		 * 只会删除集合中一个元素equals比较为true的元素(即存在对象一样的元素)
		 */
		c.remove("one");
		System.out.println("c:"+c);
		
		Collection c1=new ArrayList();
		c1.add(new Point(1,2));
		c1.add(new Point(3,4));
		c1.add(new Point(1,2));
		c1.add(new Point(5,6));
		Point p=new Point(1,2);
		System.out.println("c1"+c1);
		c1.remove(p);
		System.out.println("c1"+c1);
	}
}
