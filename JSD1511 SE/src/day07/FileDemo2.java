package day07;

import java.io.File;

/**
 * ʹ��File�����༶Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo2 {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���Ŀ¼a/b/c/d/e/f
		 */
		File dir=new File("a"+File.separator+"b"+File.separator+"c"+File.separator
				          +"d"+File.separator+"f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("������ϣ�");
		}
	}
}
