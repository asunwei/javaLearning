package day02;
/**
 * StringBuilder����ʾ
 */
public class BuilderDemo1 {
	public static void main(String[] args) {
		String str="Ħ��Ħ��!";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.toString());
		/*
		 * ����toString�������Ի�ȡ��ǰ��
		 * StringBuilder��ʾ���ַ������ݣ�
		 * */
		/*str=sb.toString();*/
		/*
		 * Ħ��Ħ������ħ��Ĳ�����
		 * ʹ��append���������ڵ�ǰ��ĩβ׷���µ�����
		 * */
		sb.append("��ħ��Ĳ�����");
		System.out.println(sb.toString());
		/*
		 * һ��������Ħ��Ħ������ħ��Ĳ���!
		 * ʹ��insert���������ڵ�ǰ���ַ����м����������*/
		sb.insert(0,"һ��������");
		System.out.println(sb.toString());
		/*һ��������һ��һ����צ����Ħ��Ħ������ħ��Ĳ���!
		 * ʹ��replace���������޸ĵ�ǰ�ַ��������ݣ��滻��
		 * ͨ����JAVA API�����������ֱ�ʶ��Χʱ����n�ǡ���ͷ����β����
		 * */
		sb.replace(4, 5,"!һ��һ����צ����");
		System.out.println(sb.toString());
		/*һ��������һ��һ����צ����Ħ��Ħ������ħ��Ĳ���!
		 * һ��������һ��һ����צ������ħ��Ĳ�����
		 * ʹ��delete��������ɾ����ǰ���ַ�����������*/
		sb.delete(13,18);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		String st="�Ϻ�����ˮ���Ժ���";
		StringBuilder ss=new StringBuilder(st);
		ss.reverse();
		System.out.println(ss.toString());
	}
}
