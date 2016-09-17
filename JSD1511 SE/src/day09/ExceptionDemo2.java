package day09;
/**
 * finally块
 * finally只能出现在异常捕获机制的最后
 * 可以直接跟在try后面，或者最后一个catch之后
 * finally可以保证无论try中的代码是否出现异常
 * 其内部的代码都会被执行
 * 通常用来完成诸如释放资源的这类操作,如关闭打开资源，删除临时文件
 * @author Administrator
 *
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str="";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("出错了！");
		}finally{
			System.out.println("finally中的代码");
		}
		System.out.println("程序结束了");
	}
}
