package day01;

public class StringDemo11 {

	public static void main(String[] args) {
		String url=
			"http://tmooc.cn/index.html";
		//   01234567890123456
		/*
		 * ȡ�ַ�����һ������Ϊһ�����ַ�����ȡ��
		 * �ַ���
		 * String sub = 
		 *   str.substring(��ʼλ��,����λ��)
		 * ������ʼλ�ã�����������λ��
		 * ���󣺽�ȡurl�е�����(tmooc.cn)����
		 */
		String host = url.substring(7,15);
		System.out.println(host); 
		url =
			"http://tarena.com.cn/java/index.html";
		/*
		 * http:// ��Ϊ��Э�顰
		 * tarena.com.cn ��������������
		 * /java/index.html ����·��
		 */
		//��URL�н�ȡ������ͨ�ð汾��
		host=url.substring(7, 
				url.indexOf('/', 7));
		System.out.println(url.indexOf('/', 7));
		System.out.println(host); 
	}
}






