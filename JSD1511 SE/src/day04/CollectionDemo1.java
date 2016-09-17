package day04;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java util.Collection
 * 是一个接口，规定了集合都应具备的功能
 * 集合也是为了存储一组元素，与数组一样
 * 但是集合提供了维护元素的相关方法，使用更简便
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		//实例化一个集合
		Collection c=new ArrayList();
		/*
		 * 向集合里面添加元素
		 * boolean add（E e）；
		 * 当给元素成功添加进集合返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * int size()
		 * 获取当前集合中的元素个数
		 */
		int size=c.size();
		System.out.println("size:"+size);
		/*
		 * toStrinn格式
		 * [元素1.toString(),元素1.toString()...]
		 */
		System.out.println(c);
		/*boolean isEmpty()
		 * 判断集合是否为空的（集合是否不包含任何元素）
		 */
		System.out.println("isEmpty:"+c.isEmpty());
		/*
		 * void clear()
		 * 清空集合元素
		 */
		c.clear();
		System.out.println("size:"+c.size());
		System.out.println(c);
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
