package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/*
 * ���ϴ�ŵ�����
 * contains����
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
		//�����Ƿ����other�Ķ���
		boolean tf=c.contains(other);
		System.out.println("�Ƿ������"+tf);
		
	}
}
