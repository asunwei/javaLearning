package day02;
/*
 * �ַ���֧��������ʽ��������
 * String[] split(String regex)
 * ����ǰ���ַ���������������ʽ�Ĳ��ֽ��в��
 * Ȼ�����еĲ�ֵ�������һ���ַ���������ʽ����
 * */
public class StringDemo3 {
	public static void main(String[] args) {
		String str="123,456,789,012";
		String[] arr=str.split(",");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		String imageName="a.jpg";
		String[] names=imageName.split("\\.");
		imageName=System.currentTimeMillis()+"."+names[1];
		System.out.println(imageName);
	}
}
