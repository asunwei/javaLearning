package day09;
/**
 * �쳣��������е�try-catch
 * @author Administrator
 *
 */
public class ExceptionDemo1_3 {
	public static void main(String[] args) {
		System.out.println("����ʼ�ˣ�");
		try{
			String str="a";

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
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			//��������ͻ�����try������������벻��ִ��
			System.out.println("��������");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ�룡");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�������ַ����±�Խ�磡");
			/*
			 * catch����д�������Բ�ͬ�쳣�в�ͬ�Ĵ����ֶ�
			 * ���Էֱ𲶻���Щ�쳣��
			 * �������Ӧ������Excetion���������ˡ�
			 * ��������쳣֮����ڸ��Ӽ̳й�ϵʱ������
			 * �쳣Ӧ�����������в��񣬸����쳣����
			 */
		}catch(Exception e){
			System.out.println("�������ǳ���һ����");
		}
		System.out.println("��������ˣ�");
	}
}