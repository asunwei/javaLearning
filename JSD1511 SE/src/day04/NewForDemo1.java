package day04;
/*
 * JDK5.0之后开始推出了一个新特性
 * 增强for循环，也叫做新循环，for each
 * 新循环不能取代传统for循环工作，新循环的作用仅用于遍历集合或数组使用
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		/*
		 * 遍历数组
		 */
		String[] array={"one","two","three","four","five"};
		//传统for循环
		for(int i=0;i<array.length;i++){
			String str=array[i];
			System.out.println(str);
		}
		//新循环
		for(String str:array){
			System.out.println(str);
		}
	}
}
