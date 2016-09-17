package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
	public static void main(String[] args) {
		List<String>list =new ArrayList<String>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");
		System.out.println(list);
		/*
		 * String已经实现了Comparable接口，
		 * 并重写了comparaTo方法，规则是按字母的编码大小比较的
		 * 但是比较中文时候没有规律可言；
		 * 当一个类已经定义了比较大小的方式，但该方式不能满足我们
		 * 对于排序需求时，我们需要自定义比较大小的规则
		 * 
		 * 由于sort方法要求集合中的元素必须实现Comparable接口，这意味着
		 * 我们想使用该方法对集合排序，集合元素要为其修改代码，我们则认为
		 * 这样的行为是对我们代码有比较大的侵入性
		 */
		
		/*
		 * 重载的sort方法，解决了上面sort方法的两个不足
		 * 
		 * 若只执行一次，使用匿名内部类来实现
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
