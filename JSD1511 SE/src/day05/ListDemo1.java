package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List ����
 * ���ظ��� ������
 * �ص㣺��ͨ���±����Ԫ�أ�����������
 * @author Administrator
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * E get(int index)
		 * 
		 * ��ȡָ���±��Ӧ��Ԫ��
		 * ����������Ԫ�صĹ��ܣ�array[i];
		 * 
		 */
		String str=list.get(1);
		System.out.println(str);
		/*
		 * ʹ�ô�ͳ��ѭ������
		 */
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
		/*
		 * ʹ����ѭ������
		 */
		for(String str1:list){
			System.out.println(str1);
		}
		/*
		 * E set(int index,E e)
		 * ��������Ԫ�����õ�ָ����λ���ϣ�����ֵΪԭλ����
		 * ��Ԫ�أ��滻Ԫ�ز���
		 * 
		 * [one,two, three,four]
		 */
		System.out.println(list);
		String old =list.set(1, "2");
		System.out.println(list);
		System.out.println("old"+old);
	}
}
