package day06;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ����һ��Ԫ�أ���ȡԪ����ѭ�Ƚ����ԭ��
 * ͨ����Ҫʵ�֡����ˡ����ܵ�ʱ�򣬾�Ӧ��ʹ���������
 * ջ��java��ʹ��˫�˶���ʵ��Deque��LinkedList������һ��ʵ����
 * @author Administrator
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList();
		/*
		 * void push(E,e)
		 * ��ջ����ѹ�롱Ԫ�أ���ջ����
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		/*
		 * E pop()
		 * ��ջ����������Ԫ��
		 * ��ջ�Ĳ�������ȡջ��Ԫ�غ󣬸�Ԫ�ؼ���ջ��ɾ��
		 */
		String str =stack.pop();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * ͬ������ʹ��peek��������ջ��Ԫ��
		 */
		str=stack.peek();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * ȡ��Ԫ��
		 */
		while(stack.size()>0){
			str=stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
