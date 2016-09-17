package day06;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 保存一组元素，存取元素遵循先进后出原则
 * 通常需要实现”后退“功能的时候，就应当使用找来完成
 * 栈在java中使用双端队列实现Deque，LinkedList是其中一个实现类
 * @author Administrator
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList();
		/*
		 * void push(E,e)
		 * 向栈顶“压入”元素，入栈操作
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		/*
		 * E pop()
		 * 从栈顶“弹出”元素
		 * 出栈的操作，获取栈顶元素后，该元素即从栈中删除
		 */
		String str =stack.pop();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * 同样可以使用peek，仅引用栈顶元素
		 */
		str=stack.peek();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * 取出元素
		 */
		while(stack.size()>0){
			str=stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
