package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����תΪ����
 * Collection�ṩ��һ������toArray�����Խ���ǰ����תΪ����
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
