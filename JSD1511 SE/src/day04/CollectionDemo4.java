package day04;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵ������Ĳ�������
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
		 * ��������������Ԫ����ӵ���ǰ������
		 * ��ִ����Ϻ󣬵�ǰ�����е�Ԫ���б仯�ͷ���true
		 *  
		 */
		boolean tf=c1.addAll(c2);
		System.out.println(tf);
		System.out.println(c1);
		/*
		 * boolean containsAll(Collection c)
		 * ����ǰ���ϰ�����������������Ԫ��
		 * ��������true
		 */
		Collection c3=new ArrayList();
		c3.add("java");
		c3.add("vb");
		c3.add("js");
		boolean containsAll =c1.containsAll(c3);
		System.out.println("�Ƿ������"+containsAll);
		/*
		 * ����������������Ԫ�شӵ�ǰ������ɾ��
		 * removeAll()
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}
}
