package day01;

public class StringDemo12 {

	public static void main(String[] args) {
		String url =
			"http://tarena.com.cn/java/index.html";
		/*
		 * http:// ��Ϊ��Э�顰
		 * tarena.com.cn ��������������
		 * /java/index.html ����·��
		 */
		/*
		 * ��ȡURL������·������
		 *  ��http://����ĵ�һ��"/"��ʼ
		 *  ���ַ���ĩβ��ȫ�������� ����·��
		 */
		int index = url.indexOf("/", 7);
		String path = url.substring(index);
		System.out.println(path); 
		
		// email: liucs@tedu.cn
		/*
		 * email����:�û���@��at �ڣ�����(����)
		 *  �������壺��ĳ������������������û�����
		 */
		// ˼������email��ַ�н�ȡ������
		String email = "liucs@tedu.cn";
		String host = email.substring(
			email.indexOf('@')+1);
		System.out.println(host); 
	}

}



