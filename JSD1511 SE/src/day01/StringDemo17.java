package day01;

import java.util.Scanner;

public class StringDemo17 {

	public static void main(String[] args) {
		/*
		 * startsWith����ַ�������Щ�ַ�Ϊ��ͷ��
		 * ����û������������ʲô
		 */
		Scanner in = new Scanner(System.in);
		//in.nextLine()�ӿ���̨��ȡһ���ַ���
		String cmd = in.nextLine();
		//���cmd �ַ����Ƿ��� �� cpΪ��ͷ������
		if(cmd.startsWith("cp ")){
			System.out.println(
					"����һ����������");
		}else{
			System.out.println("���ϵ�"); 
		}
	}

}




