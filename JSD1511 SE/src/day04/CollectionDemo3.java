package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/*
 * ���ϻ��ṩ������ɾ��Ԫ�صķ���
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
		 * ɾ����ǰ����ָ����Ԫ�أ��ɹ�ɾ������true
		 * ֻ��ɾ��������һ��Ԫ��equals�Ƚ�Ϊtrue��Ԫ��(�����ڶ���һ����Ԫ��)
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
