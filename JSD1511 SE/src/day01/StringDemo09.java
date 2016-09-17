package day01;

public class StringDemo09 {
	public static void main(String[] args) {
		/* 
		 * indexOf() 检查一个字符(一个字符串)
		 * 在字符串中位置。
		 */
		String comm = "这是一个SB东西呀!";
		int index = comm.indexOf("SB");
		System.out.println(index);
		
		comm = "这是一个好东西呀!";
		index = comm.indexOf("SB");
		System.out.println(index);
		
		/*
		 * 检查字符 '这' 在comm中的位置 
		 */
		index = comm.indexOf('这');
		System.out.println(index);//0
		/*
		 * 可以从指定起始位置开始检查字符串位置
		 * str.indexOf(被检查字符串, 起始位置);
		 * 用途：跳过一些字符中中间位置检索
		 */
		String str = "http://tmooc.cn/index.html";
		
		index = str.indexOf("/");
		System.out.println(index);//5
		//业务案例：检查http://后面是否有 “/”
			
		/*
		 * 从7位置开始检查"/"在那个位置上
		 * 如果不指定起始位置，则从0开始查找。
		 */
		index = str.indexOf("/", 7);
		System.out.println(index); 
		index=str.lastIndexOf("/");
		System.out.println(index);
	}
}



