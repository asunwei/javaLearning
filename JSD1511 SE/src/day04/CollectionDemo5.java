package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Collection�ṩ�˻�ȡ����Ԫ�صķ�ʽ
 * ��������
 * ����Set�����޷�ͨ���±����Ԫ�أ����Բ���������������ȡָ��Ԫ��
 * ֻ��ͨ���������ϵĹ����л�ȡ��ҪԪ��
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
		 * �÷�������һ��Iterator��ʵ���ࣺ������
		 * ���ϱ���Ԫ��ʹ�õľ��Ǹ�ͳһ��ʽ������������������ѭ����
		 * �ʣ�ȡ��ɾ
		 * ����ɾ��Ԫ�ز������Ǳ����
		 */
		Iterator it=c.iterator();
		/*
		 * boolean hashNext()
		 * ͨ��������ѯ�ʼ����Ƿ���Ԫ�ؿ���ȡ��
		 */
		while(it.hasNext()){
			/*
			 * e next()
			 * �Ӽ�������һ��Ԫ��
			 */
			String str=(String)it.next();
			/*Object obj=it.next();*/
			System.out.println(str);
			/*System.out.println(obj);*/
			//�Ӽ�����ɾ��#��
			if("#".equals(str)){
				/*
				 * ��ʹ�õ������������ϵĹ����У�����ͨ�����ϵķ����޸ļ���
				 * Ԫ��������������������ܻ��׳��쳣��
				 */
				//c.remove(str);
				/*
				 * void remove()
				 * �������ṩ��remove�������ڴӼ�����ɾ��ͨ��next��������
				 * ȡ������Ԫ�ء�
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}
}
