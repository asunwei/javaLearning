package day02;
/**
 * �ַ���֧��������ʽ�ķ���һ
 * boolean matches��String regex��
 * �жϵ�ǰ�ַ����Ƿ��������������ʽ��Ҫ���
 * ��ʽ,���㷵��true������false
 * */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 * */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z])+";
		String email="fancq_@tedu.com";
		boolean matches=email.matches(regex);
		if(matches){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}

}
