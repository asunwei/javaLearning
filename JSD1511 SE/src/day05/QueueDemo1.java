package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����
 * ���ڴ��һ��Ԫ�أ����Ƕ��ڴ洢���ϸ�Ҫ�󣬱�����ѭ���Ƚ��ȳ�����
 * ֻ�ܴӶ�β���Ԫ�أ��Ӷ��׻�ȡԪ��
 * ���ڶ�����ɾ����Ƶ�����Ӷ��������٣�����������һ���Եģ�
 * ����LinkedList�����������ص㣬Ϊ��Ҳ�Ƕ��е�һ��ʵ����
 * @author Administrator
 *
 */
public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList();
		/*
		 * boolean offer(E e)
		 * �����׷����Ԫ��
		 */
	    queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/*
		 * E poll();
		 * �Ӷ��׻�ȡһ��Ԫ�أ���ȡ���Ԫ�ػ�Ӷ�������ɾ��
		 */
		String str=queue.poll();
		System.out.println(queue);
		/*
		 * E peek()
		 * ��ȡ����Ԫ�أ���poll��ͬ����Ԫ�ز�����Ӷ�����ɾ��
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		//��������
		while(queue.size()>0){
			str =queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	}
}
