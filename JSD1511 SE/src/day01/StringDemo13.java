package day01;

public class StringDemo13 {

	public static void main(String[] args) {
		String str = "\n\t\u0007 �й� ";
		/*
		 * ȥ���ַ������˵Ŀհ�(c<32���ַ�)
		 * �������ַ�����ԭ�ַ������䣡
		 */
		String n = str.trim();
		System.out.println(n); 
		System.out.println(str); 
		/*
		 * ע��: ���û����Ҫȥ���Ŀհף��򷵻�
		 * ԭ�е��ַ����������ܺã���
		 */
		String name = "Tom";
		String x = name.trim();
		System.out.println(x == name); 
		/*
		 * ��ʱʹ�ã������û�������Ϣʱ��ʹ��
		 *  name = "  Tom  "
		 *  name = name.trim()
		 */
		
	}
}




