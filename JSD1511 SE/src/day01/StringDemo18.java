package day01;

public class StringDemo18 {

	public static void main(String[] args) {
		String s1 = 123+"ABC";
		double pi = 3.1415926535897932384;
		String s2 = "PI:"+pi; 
		System.out.println(s1 + " " + s2);

		//�κ��������ַ�������ʱ������
		// String.valueOf()����������ת���ַ���
		// �����ַ����������ӡ�
		//���´�������������ǵȼ۵ģ�
		s1 = String.valueOf(123)+"ABC";
		//s1 = String.valueOf(int)+"ABC";
		s2 = "PI:"+String.valueOf(pi);
		//                        double 
		System.out.println(s1 + " " + s2);
		/*
		 * String.valueOf(����) ���κ�����ת��
		 * Ϊ�ַ������ͣ�
		 * valueOf ��һϵ�����ط������
		 * 
		 * valueOf ����Ҫ��һ������ת��Ϊ�ַ���
		 * ��ʱ�򣬿��Ե����������
		 */
		//int score=2417;
		//g.drawString(
		// "Screo:"+String.valueOf(score),x,y);
		String s = String.valueOf(123)+
				String.valueOf(pi);
		System.out.println(s); 
	}

}





