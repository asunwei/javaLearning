package day09;
/**
 * �쳣��������е�try-catch
 * @author Administrator
 *
 */
public class ExceptionDemo1_1 {
	public static void main(String[] args) {
		System.out.println("����ʼ�ˣ�");
		try{
			String str=null;

			/*
			 * �������ִ�е����﷢�ֿ�ָ���
			 * ��ʵ����һ��NullPointerException��ʵ��
			 * Ȼ�󽫴���ִ�й����Լ���������λ��
			 * ��װ����ʵ���У��������׳���
			 * ֮���������Ƿ�try��Χ
			 * ��û������Ϊ��仰���ڵķ�����main������
			 * û�д����쳣��������ô�Ὣ���쳣�׳���
			 * �÷������棬˭���ø÷���˭����
			 */
			System.out.println(str.length());
			//��������ͻ�����try������������벻��ִ��
			System.out.println("��������");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ�룡");
		}
		System.out.println("��������ˣ�");
	}
}
