package day01;

public class StringDemo10 {

	public static void main(String[] args) {
		String url = 
			"http://tmooc.cn/index.html";
		  // 0123456789012345678901
		/*
		 * �Ӻ���ǰ���� ��.����λ��(21)
		 * str.lastLndexOf(".")
		 */
		int index = url.lastIndexOf(".");
		System.out.println(index);//21
		/*
		 * ��;:����ж�һ��URL�Ƿ���������ҳ
		 */
		url="http://tmooc.cn/index.html";
		if(url.lastIndexOf(".html")>=0){
			System.out.println("url:��ҳ����");
		}
		url = 
		"http://tmooc.cn/images/logo.png";
		if(url.lastIndexOf(".html")>=0){
			System.out.println("url:��ҳ����");
		}else{
			System.out.println("������ҳ");
		}
		
	}
}







