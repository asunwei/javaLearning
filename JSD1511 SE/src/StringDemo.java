
public class StringDemo {
	public static void main(String[] args) {
		char c=30000;
		System.out.println(c);
		c=20013;
		System.out.println(c);
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		//�ַ��з�װ��һ���ַ�����
		//�ַ������е��ַ�����unicode
		char[] chs ={'��','��'};
		String str=new String(chs);
		System.out.println(str);
		//java�еġ��ַ����顱�����ַ������
		//ÿ���ַ����ڴ���ռ16λ��2�ֽڣ�
		System.out.println((int)'��');
		System.out.println((int)'֣');
	}

}
