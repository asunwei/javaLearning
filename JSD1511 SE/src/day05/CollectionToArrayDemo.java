package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转为数组
 * Collection提供了一个方法toArray，可以将当前集合转为数组
 * @author Administrator
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		Object[] array=c.toArray();
//		String[] str=c.toArray(new String[c.size()]);
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
	}
}
