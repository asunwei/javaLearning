package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ����ѭ����������
 */
public class NewForDemo2 {
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
		 * ��ѭ�������µ��﷨���󣬶��Ǳ������ڱ���Դ�����ʱ��
		 * ������ʹ����ѭ���������ϣ��򽫴����޸�Ϊʹ�õ�������ʵ��
		 * ������ѭ���������Ͼ��ǵ�������������
		 * ��ô����Ҫע�⣺ʹ����ѭ���������ϵĹ����в���ͨ�����ϵ�
		 * �����޸�Ԫ��������
		 */
		
		for(Object o:c){
			/*Iterator it = c.iterator();
			while(it.hasNext()){
				Object o = it.next();*/
				String str = (String)o;
				System.out.println(str);
				
		}
	}
}
