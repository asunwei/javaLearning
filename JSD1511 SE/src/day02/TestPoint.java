package day02;

public class TestPoint {

	/**
	 * ����Object�ж���ķ���
	 * @param args
	 */
	public static void main(String[] args) {
		Point p=new Point(1,2);
		/*
		 * �����ǲ���дObject��toString����
		 * ���ص��ַ��������岻����Ϊ���ַ���������
		 * �ǵ�ǰ������ڴ��ַ��Ϣ����ʽ��
		 * ����@��ַ
		 * ���ָ�ʽҲ��Ϊ�������
		 * */
//		String str=p.toString();
//		System.out.println(str);
		/*
		 * System.out .println(Object 0����
		 * �÷����Ὣ�����Ķ����toString����
		 * ���ص��ַ������������̨
		 * */
		System.out.println(p);
		
		Point p2=new Point(1,2);
		System.out.println(p2);
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
		
	}

}
