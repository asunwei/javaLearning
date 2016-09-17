package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/*
 * 集合存放的引用
 * contains（）
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Point p=new Point(1,2);
		c.add(p);
		System.out.println("p"+p);
		System.out.println("c"+c);
		p.setX(2);
		System.out.println("p"+p);
		System.out.println("c"+c);
		Point other=new Point(2,2);
		System.out.println(p==other);
		System.out.println(p.equals(other));
		//集合是否包含other的对象
		boolean tf=c.contains(other);
		System.out.println("是否包含："+tf);
		
	}
}
