package day01;

public class StringDemo15 {

	public static void main(String[] args) {
		String code = "690102819109";
		/*
		 * ����:����������� 
		 *   ����λ���:6+0+0+8+9+0 c1
		 *   ż��λ���:9+1+2+1+1+9 c2
		 */
		/*
		 * �۲����ݵ��ص�
		 *   "690102819109"
		 *    012345678901
		 * ����λ����ţ�0 2 4 6 8 10
		 * ż��λ����ţ�1 3 5 7 9 11
		 * for(i = 0 2 4 6 8 10){
		 *   // i ������λ��
		 *   // charAt(i)����λ�õ��ַ�
		 *   //   '6' '0' '0' '8' '9' '0' 
		 *   // �ۼƣ� '6'-'0' '0'-'0' '0'-'0'
		 *   //       '8'-'0' ....
		 *   // i+1 ��ż��λ��
		 * }
		 */
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<code.length(); i+=2){
			//i = 0 2 4 6 8 10
			char ch1 = code.charAt(i);
			c1 += ch1;			
			char ch2 = code.charAt(i+1);
			c2 += ch2-'0';
		}
		System.out.println(c1+" "+c2);
	}

}






