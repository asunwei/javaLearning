package day01;

public class StringDemo16 {

	public static void main(String[] args) {
		/*
		 * endsWith �������ڼ���ַ����Ľ�β
		 * �ַ���������������������true,����
		 * ����false
		 * ������;������ļ�����Ӧ���ļ�����
		 */
		String filename = "Java����.avi";
		if(filename.endsWith(".avi")){
			System.out.println("������Ƶ�ļ�");
		}
		filename = "Java����.aVI  ";
		if(filename.trim()
			.toLowerCase().endsWith(".avi")){
			System.out.println("������Ƶ�ļ�");
		}
		
		
 
		
	}
}








