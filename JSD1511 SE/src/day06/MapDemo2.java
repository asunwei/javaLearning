package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * boolean containsKey(K k)
 * �жϵ�ǰMap�Ƿ����������key
 * �жϱ�׼��������eqauls�����ıȽϽ��
 * 
 * boolean continsValue(V v)
 * �Ƿ����������value���õ���Խ���
 * @author Administrator
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",98);
		map.put("��ѧ",97);
		map.put("Ӣ��",96);
		map.put("����",95);
		map.put("��ѧ",98);
		System.out.println(map);
		boolean containsKey=map.containsKey("����");
		System.out.println(containsKey);
		boolean containsValue=map.containsValue(98);
		System.out.println(containsValue);
	}
}
