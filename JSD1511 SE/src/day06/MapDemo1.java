package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * ���ұ���key-value�Ե���ʽ�洢Ԫ��
 * ����key��Map�в������ظ�(equals�Ƚϣ�
 * ����ʵ������HashMap��ɢ�б�ʹ��ɢ�б��㷨ʵ�֣�
 * HashMap�Ĳ������ܱ�����ǿ�ܶ�
 * @author Administrator
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		//Map���Էֱ���Key��Map
		Map<String,Integer> map=new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * ��ָ����key��value����map��
		 * ����Map�е�key�������ظ���������ʹ��
		 * key����һ��value��Ὣ���е�key��Ӧ��evalueֵ�滻��
		 * �������滻��valueֵ���أ���ʹ���µ�key���򷵻�null
		 */
		Integer num=map.put("����", 98);
		map.put("��ѧ", 97);
		map.put("Ӣ��", 96);
		map.put("����", 95);
		map.put("��ѧ", 98);
		System.out.println(map);
		System.out.println(num);
		num=map.put("����", 99);
		System.out.println(map);
		System.out.println(num);
		/*
		 * v get(K k)
		 * ���ݸ�����keyֵ��ȡ��Ӧ��value
		 * ��������key��Map�в����ڣ��򷵻�null
		 */
		num=map.get("����");
		System.out.println(num);
		num=map.get("Ӣ��");
		System.out.println(num);
		/*
		 * v remove(K k)
		 * ���ݸ�����key��Map��ɾ����Ӧ������
		 * ��ֵ�ԡ�������ֵ���Ǹ�key��Ӧ��value
		 */
		System.out.println("ɾ��Ӣ��...");
		Integer old=map.remove("Ӣ��");
		System.out.println(old);
		System.out.println(map);
		System.out.println();
	}
}
