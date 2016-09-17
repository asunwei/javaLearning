package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection提供了获取集合元素的方式
 * 遍历集合
 * 由于Set集合无法通过下标操作元素，所以不能像数组那样获取指定元素
 * 只能通过遍历集合的过程中获取需要元素
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		/*
		 * Itrator itrator()
		 * 该方法返回一个Iterator的实现类：迭代器
		 * 集合遍历元素使用的就是该统一方式，迭代器遍历集合遵循规则：
		 * 问，取，删
		 * 其中删的元素操作不是必须的
		 */
		Iterator it=c.iterator();
		/*
		 * boolean hashNext()
		 * 通过迭代器询问集合是否还有元素可以取出
		 */
		while(it.hasNext()){
			/*
			 * e next()
			 * 从集合中下一个元素
			 */
			String str=(String)it.next();
			/*Object obj=it.next();*/
			System.out.println(str);
			/*System.out.println(obj);*/
			//从集合中删除#号
			if("#".equals(str)){
				/*
				 * 在使用迭代器遍历集合的过程中，不能通过集合的方法修改集合
				 * 元素数量，否则迭代器可能会抛出异常。
				 */
				//c.remove(str);
				/*
				 * void remove()
				 * 迭代器提供的remove方法用于从集合中删除通过next（）方法
				 * 取出来的元素。
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}
}
