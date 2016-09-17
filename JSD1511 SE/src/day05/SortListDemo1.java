package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Collections是集合的工具类
 * 提供了便于操作集合的相关静态方法
 * sort方法用于对List集合进行自然排序
 * @author Administrator
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<10;i++){
			list.add(ran.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
