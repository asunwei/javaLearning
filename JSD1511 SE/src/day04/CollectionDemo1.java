package day04;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java util.Collection
 * ��һ���ӿڣ��涨�˼��϶�Ӧ�߱��Ĺ���
 * ����Ҳ��Ϊ�˴洢һ��Ԫ�أ�������һ��
 * ���Ǽ����ṩ��ά��Ԫ�ص���ط�����ʹ�ø����
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		//ʵ����һ������
		Collection c=new ArrayList();
		/*
		 * �򼯺��������Ԫ��
		 * boolean add��E e����
		 * ����Ԫ�سɹ���ӽ����Ϸ���true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * int size()
		 * ��ȡ��ǰ�����е�Ԫ�ظ���
		 */
		int size=c.size();
		System.out.println("size:"+size);
		/*
		 * toStrinn��ʽ
		 * [Ԫ��1.toString(),Ԫ��1.toString()...]
		 */
		System.out.println(c);
		/*boolean isEmpty()
		 * �жϼ����Ƿ�Ϊ�յģ������Ƿ񲻰����κ�Ԫ�أ�
		 */
		System.out.println("isEmpty:"+c.isEmpty());
		/*
		 * void clear()
		 * ��ռ���Ԫ��
		 */
		c.clear();
		System.out.println("size:"+c.size());
		System.out.println(c);
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
