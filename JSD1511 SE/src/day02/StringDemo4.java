package day02;
/*
 * �ַ���֧��������ʽ��������
 * String replaceAll��String regex��String str��
 * ����ǰ�ַ������������������ʽ�Ĳ����滻Ϊ�������ַ���
 * */
public class StringDemo4 {
	public static void main(String[] args) {
		String str="xyz123abc456def789ghi012";
		/*���ַ����е����ֲ����滻Ϊ��#NUMER#��
		 * */
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
