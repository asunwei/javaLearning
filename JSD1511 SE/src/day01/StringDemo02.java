package day01;

public class StringDemo02 {

	public static void main(String[] args) {
		//ʲô��Unicode��һ���ַ�һ������
		char c = 30000;
		System.out.println(c);//��
		c = 20013;
		System.out.println(c);//��
		char c1='��';
		System.out.println(c1);
		int c2='��';
		System.out.println(c2);
		System.out.println('��'); 
		System.out.println(Integer.toBinaryString((int)'��'));
		
		//�ַ����з�װ��һ���ַ�����
		//�ַ������е��ַ�����unicdoe
		char[] chs = {30000, 20013, 22269};
		String str = new String(chs);
		System.out.println(str);
		//java �С��ַ����顱 �����ַ��������
		System.out.println(chs); 
		// ÿ���ַ����ڴ���ռ�� 16λ��2�ֽ�byte��
	}
}








