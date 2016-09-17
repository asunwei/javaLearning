package day01;

public class StringDemo10 {

	public static void main(String[] args) {
		String url = 
			"http://tmooc.cn/index.html";
		  // 0123456789012345678901
		/*
		 * 从后向前检索 “.”的位置(21)
		 * str.lastLndexOf(".")
		 */
		int index = url.lastIndexOf(".");
		System.out.println(index);//21
		/*
		 * 用途:如何判断一个URL是否请求了网页
		 */
		url="http://tmooc.cn/index.html";
		if(url.lastIndexOf(".html")>=0){
			System.out.println("url:网页请求");
		}
		url = 
		"http://tmooc.cn/images/logo.png";
		if(url.lastIndexOf(".html")>=0){
			System.out.println("url:网页请求");
		}else{
			System.out.println("不是网页");
		}
		
	}
}







