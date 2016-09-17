package day09;
/**
 * 异常捕获机制中的try-catch
 * @author Administrator
 *
 */
public class ExceptionDemo1_3 {
	public static void main(String[] args) {
		System.out.println("程序开始了！");
		try{
			String str="a";

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
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			//上面出错后就会跳出try，所以下面代码不会执行
			System.out.println("！！！！");
		}catch(NullPointerException e){
			System.out.println("出现了空指针！");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("出现了字符串下标越界！");
			/*
			 * catch可以写多个，针对不同异常有不同的处理手段
			 * 可以分别捕获那些异常。
			 * 但是最后应当捕获Excetion。避免闪退。
			 * 当捕获的异常之间存在父子继承关系时，子类
			 * 异常应当在上面先行捕获，父类异常在下
			 */
		}catch(Exception e){
			System.out.println("反正就是出了一个错！");
		}
		System.out.println("程序结束了！");
	}
}