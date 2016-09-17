package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
	public static void main(String[] args) {
		List<String>list =new ArrayList<String>();
		list.add("����ʦ");
		list.add("С����ʦ");
		list.add("����");
		System.out.println(list);
		/*
		 * String�Ѿ�ʵ����Comparable�ӿڣ�
		 * ����д��comparaTo�����������ǰ���ĸ�ı����С�Ƚϵ�
		 * ���ǱȽ�����ʱ��û�й��ɿ��ԣ�
		 * ��һ�����Ѿ������˱Ƚϴ�С�ķ�ʽ�����÷�ʽ������������
		 * ������������ʱ��������Ҫ�Զ���Ƚϴ�С�Ĺ���
		 * 
		 * ����sort����Ҫ�󼯺��е�Ԫ�ر���ʵ��Comparable�ӿڣ�����ζ��
		 * ������ʹ�ø÷����Լ������򣬼���Ԫ��ҪΪ���޸Ĵ��룬��������Ϊ
		 * ��������Ϊ�Ƕ����Ǵ����бȽϴ��������
		 */
		
		/*
		 * ���ص�sort���������������sort��������������
		 * 
		 * ��ִֻ��һ�Σ�ʹ�������ڲ�����ʵ��
		 */
		Comparator<String> com=new Comparator<String>(){
			public int compare(String o1,String o2){
				return o1.length()-o2.length();
			}
		};
		Collections.sort(list,com);
		System.out.println(list);
	}
}
