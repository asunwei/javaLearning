package day01;

public class StringDemo09 {
	public static void main(String[] args) {
		/* 
		 * indexOf() ���һ���ַ�(һ���ַ���)
		 * ���ַ�����λ�á�
		 */
		String comm = "����һ��SB����ѽ!";
		int index = comm.indexOf("SB");
		System.out.println(index);
		
		comm = "����һ���ö���ѽ!";
		index = comm.indexOf("SB");
		System.out.println(index);
		
		/*
		 * ����ַ� '��' ��comm�е�λ�� 
		 */
		index = comm.indexOf('��');
		System.out.println(index);//0
		/*
		 * ���Դ�ָ����ʼλ�ÿ�ʼ����ַ���λ��
		 * str.indexOf(������ַ���, ��ʼλ��);
		 * ��;������һЩ�ַ����м�λ�ü���
		 */
		String str = "http://tmooc.cn/index.html";
		
		index = str.indexOf("/");
		System.out.println(index);//5
		//ҵ���������http://�����Ƿ��� ��/��
			
		/*
		 * ��7λ�ÿ�ʼ���"/"���Ǹ�λ����
		 * �����ָ����ʼλ�ã����0��ʼ���ҡ�
		 */
		index = str.indexOf("/", 7);
		System.out.println(index); 
		index=str.lastIndexOf("/");
		System.out.println(index);
	}
}



