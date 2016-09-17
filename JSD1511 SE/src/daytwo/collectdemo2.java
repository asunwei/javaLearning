package daytwo;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

public class collectdemo2 {
	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		Point p=new Point(1,2);
		c.add(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		Point other =new Point(2,2);
		boolean tf=c.contains(other);
		System.out.println("ÊÇ·ñ°üº¬£º"+tf);
		
	}
}
