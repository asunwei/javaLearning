package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Map�ı���
 * Map���������ַ�ʽ
 * 1���������е�key
 * 2���������е�key-value��
 * 3���������е�Value����Զ��Բ����ã�
 * @author Administrator
 *
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",98);
		map.put("��ѧ",97);
		map.put("Ӣ��",96);
		map.put("����",95);
		map.put("��ѧ",98);
		/*
		 * ��������key
		 * 
		 * Set<k> keySet()
		 * ����ǰMap������key�浽һ��Set������
		 * �����ü��Ϸ���
		 */
		Set<String> setKey=map.keySet();
		for(String set:setKey){
			System.out.println("set:"+set);
		}
			
			/*
			 * ����ÿһ���ֵ��
			 * Entry��Map���ڲ��࣬��ÿһ��ʵ������
			 * ��ʾһ���ֵ�ԡ���key��value������Ҫ�������
			 * 
			 * Set<Entry<K,V>> entrySet()
			 */
			Set<Entry<String,Integer>> entrySet=map.entrySet();
			for(Entry<String,Integer> entry:entrySet){
				String key=entry.getKey();
				Integer value=entry.getValue();
				System.out.println(key+":"+value);
			}
			/*
			 * Collection<V> values()
			 * ����ǰMap�����е�value���뵽������
			 * Ȼ�󷵻ظü���
			 */
			Collection<Integer> values=map.values();
			for(Integer value:values){
				System.out.println("value:"+value);
			}
	}
}
