package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ�����ص�add��remove����
 * @author Administrator
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * void add(int index,E e)
		 * ��ָ����Ԫ�ء����롱��ָ����λ��,ԭλ�ü�����Ԫ�ذ�˳��
		 * �����ƶ�
		 * 
		 * [one,two,2,three,four]
		 */
		list.add(2, "2");
		System.out.println(list);
		/*
		 * E remove(int index)
		 * ɾ�����ڼ����и���λ�õ�Ԫ�أ�����ɾ����Ԫ�ط���
		 * 
		 * [one,two,2 four]
		 */
		String old=list.remove(3);
		System.out.println(list);
		System.out.println("old:"+old);
		/*
		 * ѭ��ɾ��Ԫ��ʱ��Ҫ����ɾ��
		 * �����±��ڳ�����size�ڼ�
		 */
		for(int i=list.size()-1;i>=0;i--){
			list.remove(i);
		}
		System.out.println("ɾ�����");
		System.out.println(list);
	}
}
