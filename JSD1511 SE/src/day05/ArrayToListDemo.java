package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ������תΪ����
 * ��Ҫע�⣬ֻ��ת��ΪList���ϡ�
 * ʹ������Ĺ�����Arrays�ľ�̬����asList��ʵ�֣�List����Դ���ظ�Ԫ�أ�
 * @author Administrator
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array ={"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		list.set(0, "1");
		System.out.println(list);
		//�޸ļ���Ԫ�ؾ����޸������Ӧ��Ԫ��
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		//����ת���ļ��ϲ����������Ԫ��
		//list.add("five");
		/*
		 * �����޸�Ԫ����������ʱ���������д���һ������
		 */
		List<String> list1=new ArrayList<String>(list);
		//list1.addAll(list); 
		list1.add("five");
		System.out.println(list1);
		
		Set<String> set= new HashSet<String>(list1);
		System.out.println(set);
		
	}
	
}
