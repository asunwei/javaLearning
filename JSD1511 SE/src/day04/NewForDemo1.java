package day04;
/*
 * JDK5.0֮��ʼ�Ƴ���һ��������
 * ��ǿforѭ����Ҳ������ѭ����for each
 * ��ѭ������ȡ����ͳforѭ����������ѭ�������ý����ڱ������ϻ�����ʹ��
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		/*
		 * ��������
		 */
		String[] array={"one","two","three","four","five"};
		//��ͳforѭ��
		for(int i=0;i<array.length;i++){
			String str=array[i];
			System.out.println(str);
		}
		//��ѭ��
		for(String str:array){
			System.out.println(str);
		}
	}
}
