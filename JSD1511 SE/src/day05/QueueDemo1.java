package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 用于存放一组元素，但是对于存储有严格要求，必须遵循：先进先出规则
 * 只能从队尾添加元素，从队首获取元素
 * 由于队列增删操作频繁，从而遍历很少（遍历队列是一次性的）
 * 所以LinkedList满足其所有特点，为此也是队列的一个实现类
 * @author Administrator
 *
 */
public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList();
		/*
		 * boolean offer(E e)
		 * 向队列追加新元素
		 */
	    queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		/*
		 * E poll();
		 * 从队首获取一个元素，获取后该元素会从对列中呗删除
		 */
		String str=queue.poll();
		System.out.println(queue);
		/*
		 * E peek()
		 * 获取队首元素，与poll不同，该元素并不会从队列中删除
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		//遍历队列
		while(queue.size()>0){
			str =queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	}
}
