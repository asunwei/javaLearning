package day01;

public class StringDemo11 {

	public static void main(String[] args) {
		String url=
			"http://tmooc.cn/index.html";
		//   01234567890123456
		/*
		 * 取字符串的一部分作为一个新字符串：取子
		 * 字符串
		 * String sub = 
		 *   str.substring(开始位置,结束位置)
		 * 包含开始位置，不包含结束位置
		 * 需求：截取url中的域名(tmooc.cn)部分
		 */
		String host = url.substring(7,15);
		System.out.println(host); 
		url =
			"http://tarena.com.cn/java/index.html";
		/*
		 * http:// 称为”协议“
		 * tarena.com.cn 域名（主机名）
		 * /java/index.html 请求路径
		 */
		//从URL中截取域名的通用版本：
		host=url.substring(7, 
				url.indexOf('/', 7));
		System.out.println(url.indexOf('/', 7));
		System.out.println(host); 
	}
}






