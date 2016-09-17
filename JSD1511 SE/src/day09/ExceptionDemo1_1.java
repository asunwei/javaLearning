package day09;
/**
 * 异常捕获机制中的try-catch
 * @author Administrator
 *
 */
public class ExceptionDemo1_1 {
	public static void main(String[] args) {
		System.out.println("程序开始了！");
		try{
			String str=null;

			/*
			 * 当虚拟机执行到这里发现空指针后
			 * 会实例化一个NullPointerException的实例
			 * 然后将代码执行过程以及具体出错的位置
			 * 封装到该实例中，并将其抛出来
			 * 之后会检查代码是否被try包围
			 * 若没有则认为这句话所在的方法（main方法）
			 * 没有处理异常能力，那么会将该异常抛出到
			 * 该方法外面，谁调用该方法谁处理
			 */
			System.out.println(str.length());
			//上面出错后就会跳出try，所以下面代码不会执行
			System.out.println("！！！！");
		}catch(NullPointerException e){
			System.out.println("出现了空指针！");
		}
		System.out.println("程序结束了！");
	}
}
