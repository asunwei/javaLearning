package day06;

import java.io.File;

/**
 * java.util.FIle
 * �������ڱ�ʾ�����ϵ�һ���ļ���Ŀ¼
 * ʹ��File���ԣ�
 * 1�������ļ���Ŀ¼��������Ϣ
 * 2�������ļ���Ŀ¼(������ɾ����
 * 3���鿴�ļ���Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file=new File("."+File.separator+"text.txt");
		//��ȡ�ļ���
		String name=file.getName();
		System.out.println("name"+name);
		//�ļ��Ĵ�С���ֽڣ�
		long length=file.length();
		System.out.println("length��"+length+"�ֽ�");
		//����޸�ʱ��
		long lm=file.lastModified();
		boolean cr=file.canRead();
		boolean cw=file.canWrite();
		System.out.println(lm);
		System.out.println(cr);
		System.out.println(cw);
		boolean ih = file.isHidden();
		System.out.println(ih);
	}
}
