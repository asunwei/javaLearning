package day09;
/**
 * finally��
 * finallyֻ�ܳ������쳣������Ƶ����
 * ����ֱ�Ӹ���try���棬�������һ��catch֮��
 * finally���Ա�֤����try�еĴ����Ƿ�����쳣
 * ���ڲ��Ĵ��붼�ᱻִ��
 * ͨ��������������ͷ���Դ���������,��رմ���Դ��ɾ����ʱ�ļ�
 * @author Administrator
 *
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str="";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("�����ˣ�");
		}finally{
			System.out.println("finally�еĴ���");
		}
		System.out.println("���������");
	}
}
