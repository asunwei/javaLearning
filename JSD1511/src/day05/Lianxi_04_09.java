package day05;
//������Ϊ��9��99��999��...��9999999999��Ҫ��ʹ�ó����������еĺͣ����ڿ���̨��������
public class Lianxi_04_09 {
	public static void main(String[] args) {
		long nine=0;
		long result=0;
		for(int i=1;i<=10;i++){
			nine=10*nine+9;
			result+=nine;
		}
		System.out.println("result="+result);
	}

}
