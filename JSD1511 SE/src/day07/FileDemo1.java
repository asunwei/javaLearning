package day07;
import java.io.File;
public class FileDemo1 {
	/**ʹ��file����Ŀ¼
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰ��Ŀ¼�´���һ������demoĿ¼
		 */
		File dir=new File("demo");
		if(!dir.exists()){
			//����Ŀ¼
			dir.mkdir();
			System.out.println("������ϣ�");
		}
	}

}
