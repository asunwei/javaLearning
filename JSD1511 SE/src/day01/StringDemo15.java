package day01;

public class StringDemo15 {

	public static void main(String[] args) {
		String code = "690102819109";
		/*
		 * 需求:将上述号码的 
		 *   奇数位求和:6+0+0+8+9+0 c1
		 *   偶数位求和:9+1+2+1+1+9 c2
		 */
		/*
		 * 观察数据的特点
		 *   "690102819109"
		 *    012345678901
		 * 奇数位的序号：0 2 4 6 8 10
		 * 偶数位的序号：1 3 5 7 9 11
		 * for(i = 0 2 4 6 8 10){
		 *   // i 是奇数位置
		 *   // charAt(i)奇数位置的字符
		 *   //   '6' '0' '0' '8' '9' '0' 
		 *   // 累计： '6'-'0' '0'-'0' '0'-'0'
		 *   //       '8'-'0' ....
		 *   // i+1 是偶数位置
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






