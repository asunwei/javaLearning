package day03;
/*
 * ��װ��֧��һ����̬����parseXXX(String str)
 * �����ǽ��ַ���ת��Ϊ�����Ļ�������
 * ǰ���Ǹ��ַ���������ȷ������Ҫת���Ļ������͵�ֵ
 */
public class NumberDemo3 {
	public static void main(String[] args) {
		String str="123";
//		int i=Integer.valueOf(str)
		int i=Integer.parseInt(str);
		i+=1;
		System.out.println(i);
		String str1="123.123";
		double d=Double.parseDouble(str1);
		d+=1;
		System.out.println(d);
	}
}
