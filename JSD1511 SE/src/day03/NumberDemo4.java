package day03;
/*
 * java 5.0之后推出了一个新的特性
 * 自动拆装箱
 */
public class NumberDemo4 {
	public static void main(String[] args) {
		/*
		 * 自动拆装箱不是JVM认可的，而是编译器认可的
		 * 当编译器在编译下面代码的时候，会自动添加代码将基本类型转换引用类型
		 * 所以在编译后的class文件中
		 * 下面代码是：
		 * Integer i=Integer.valueOf(1);
		 */
		Integer i=1;
		/*
		 * 同样的，下面代码在编译后的class文件中的代码是：
		 * int ii=i.intValue();
		 */
		int ii=i;
	}
}
