package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ����е�����������Լ�������е�Ԫ������
 * @author Administrator
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {//Collection�ǽӿ�
		Collection <String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		//��ѭ����ʽ
		for(String str:c){
			System.out.println(str);
		}
		//��������ʽ
		/*
		 * �������ķ�����ʲôȡ���ڼ����ж���ķ������ͣ�һ�¼���
		 */
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println(0x122/2);
	}
}