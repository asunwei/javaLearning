package day01;

public class StringDemo14 {

	public static void main(String[] args) {
		String str = "���Ϻɻ����л�";
		//            0 1 2 3
		char c = str.charAt(2);
		System.out.println(c);
		/*
		 * charAt������forѭ����ϣ���������
		 * �ַ�����ȫ�����ַ���
		 * ����: ���һ���ַ������ַ��ı��롣 
		 */
		str = "���ﲻ֪���ǿ�";
		for(int i=0; i<str.length(); i++){
			// i = 0 1 2 3 4 ...length-1
			// i ����ÿ���ַ���λ��
			char ch = str.charAt(i); 
			//ch �����ַ����е�ÿ���ַ�
			System.out.println(ch); 
		}
		
	}
}







