package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 使用新循环遍历集合
 */
public class NewForDemo2 {
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
		 * 新循环不是新的语法现象，而是编译器在编译源代码的时候，
		 * 若发现使用新循环遍历集合，则将代码修改为使用迭代器来实现
		 * 所以新循环遍历集合就是迭代器遍历集合
		 * 那么就需要注意：使用新循环遍历集合的过程中不能通过集合的
		 * 方法修改元素数量！
		 */
		
		for(Object o:c){
			/*Iterator it = c.iterator();
			while(it.hasNext()){
				Object o = it.next();*/
				String str = (String)o;
				System.out.println(str);
				
		}
	}
}
