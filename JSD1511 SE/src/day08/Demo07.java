package day08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo07 {
	public static void main(String[] args)throws Exception {
		Bird b1=new Bird();
		FileOutputStream fos=new FileOutputStream("obj.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//ʹ�ø߼����ṩ�ķ���
		/*
		 * writeObject �Զ�������b1ת��Ϊһϵ��
		 * byte����д���ײ��byte����
		 * writeObject �������Զ�����Java�������������ϲ���Ķ���IO����
		 * 
		 * ����������ڻ���������Ļ�������չ����
		 * ���������
		 */
		oos.writeObject(b1);
		oos.close();
	}
}
