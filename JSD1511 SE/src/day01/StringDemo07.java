package day01;

public class StringDemo07 {

	public static void main(String[] args) {
		String s1 = "ABC"; 
		String s2 = "ABC";
		String s3 = new String("ABC");
		/*
		 * == �Ƚ��ַ����Ƿ�һ���ǲ����׵ģ� 
		 */
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		/*
		 * equals �����������ڱȽ��ַ����Ƿ���ȵķ���
		 */
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
	}

}
