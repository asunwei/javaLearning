package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡList�����е��Ӽ�
 * @author Administrator
 *
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * List<E> subList(int start,int end)
		 * ��ȡ��ǰ�ַ���ָ����Χ�ڵ�Ԫ�ػ�ȡ���ַ���
		 * [3,4,5,6,7]
		 */
		List<Integer> subList=list.subList(3, 8);
		System.out.println("sub"+subList);
		/*
		 * �Ӽ�ÿ��Ԫ������10��
		 */
		for(int i=0;i<subList.size();i++){
			Integer num=subList.get(i);
			num=num*10;
			subList.set(i, num);			
		}
		System.out.println(subList);
		System.out.println(list);
		/*
		 * ɾ��3-7��Ԫ��
		 */
		list.subList(3, 8).clear();
		System.out.println(list);
	} 
}
