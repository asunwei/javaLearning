package day01;

public class StringDemo06 {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = "ABC";
		String s3 = "A";
		String s4 = "BC";
		String s5 = s3+s4;//�������ӣ�
		/*
		 * s2 �������� new String("ABC")������
		 * ����s1 �� s2 ������ ��ͬ�Ķ���
		 * s1��s2��ֵ����ͬ��
		 * s5 ���õ����ַ����������ӵĽ��
		 * Ҳ�������ַ������ã�
		 */
		System.out.println(s1==s2);//false
		System.out.println(s5==s2);//false
		System.out.println(s1);
		System.out.println(s2);
	}

}
