package day03;
/*
 * ��װ��
 * ���ڽ���������Ͳ��ܲ���������󿪷�������
 * ��װ����Խ����������Զ������ʽ����
 * ��δ���������������������
 * �������Ͱ�װ��̳���Number�࣬���Խ�6����������֮��ת��
 * */
public class NumberDemo {
	public static void main(String[] args) {
		double d=123.123;
		//����������ת��Ϊ��װ��
		//1:���ù��췽��
		Double d1=new Double(d);
		//2:ʹ�þ�̬����valueOf
		Double d2=Double.valueOf(d);
		
		//�Ƽ�ʹ��valueOf����ʽ������װ��ʵ��
		int i=127;
		//Integer��������1�ֽ����ڵ�������װ����
		Integer i1=Integer.valueOf(i);
		Integer i2=Integer.valueOf(i);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		/*
		 * ����������ת��Ϊ��������
		 * ����ת��Ϊ�������ֻ������ͣ�����ע��
		 * ��ת���������ͳ��Ȳ��㣬���Է������ֻ���ȱʧ
		 * 
		 */
		//Double-->double
		d=d1.doubleValue();
		System.out.println("d:"+d);
		//Double-->int 
		i=d1.intValue();
		System.out.println("i:"+i);
		//Double-->byte
		byte b=d1.byteValue();
		System.out.println("b:"+b);
	}
}
