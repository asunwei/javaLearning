package day08;

import java.io.FileInputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		/*
		 * new FIS() �ļ�����ֻ����ʽ��
		 * ����ļ����ڣ����ļ����ļ�ָ����0λ��
		 * ����ļ������ڣ����׳��쳣
		 * ����ļ������Զ�ȡ��Ҳ�׳��쳣
		 */
		FileInputStream in=new FileInputStream("demo.dat");
		/*
		 * int b=in.read(��
		 * ���ļ���ǰλ�ö�ȡһ��byte
		 * �������ļ�ĩβ��ʱ�򣬷���-1��Ϊ������ʶ
		 */
		int b;
		while((b=in.read())!=-1){
			//b���ļ���ÿ��byte
			System.out.print(b+" ");
		}
		in.close();
	}
}
