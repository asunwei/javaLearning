package day01;

public class StringDemo12 {

	public static void main(String[] args) {
		String url =
			"http://tarena.com.cn/java/index.html";
		/*
		 * http:// 称为”协议“
		 * tarena.com.cn 域名（主机名）
		 * /java/index.html 请求路径
		 */
		/*
		 * 截取URL中请求路径部分
		 *  从http://后面的第一个"/"开始
		 *  到字符串末尾的全部内容是 请求路径
		 */
		int index = url.indexOf("/", 7);
		String path = url.substring(index);
		System.out.println(path); 
		
		// email: liucs@tedu.cn
		/*
		 * email规则:用户名@（at 在）域名(主机)
		 *  完整意义：在某个域名服务器开设的用户信箱
		 */
		// 思考：从email地址中截取域名？
		String email = "liucs@tedu.cn";
		String host = email.substring(
			email.indexOf('@')+1);
		System.out.println(host); 
	}

}



