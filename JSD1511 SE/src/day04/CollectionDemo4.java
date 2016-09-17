package day04;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的批量的操作方法
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("vb");
		
		Collection c2=new ArrayList();
		c2.add("js");
		c2.add("oc");
		c2.add("java");
		/*
		 * boolean addAll(Collection c)
		 * 将给定集合所有元素添加到当前集合中
		 * 若执行完毕后，当前集合中的元素有变化就返回true
		 *  
		 */
		boolean tf=c1.addAll(c2);
		System.out.println(tf);
		System.out.println(c1);
		/*
		 * boolean containsAll(Collection c)
		 * 若当前集合包含给定集合中所以元素
		 * 方法返回true
		 */
		Collection c3=new ArrayList();
		c3.add("java");
		c3.add("vb");
		c3.add("js");
		boolean containsAll =c1.containsAll(c3);
		System.out.println("是否包含："+containsAll);
		/*
		 * 将给定集合中所有元素从当前集合中删除
		 * removeAll()
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}
