package day04;

public class TestPoint4 {

	/**
	 * ���͵�ԭ����Object
	 * ����ֻ�Ǹ�֪Ӧ�������͵����͵���ʲô��������
	 * ��������ֵʱ��������������ʵ�������뷺���Ƿ�һ��
	 * ���ҷ���ֵ��ʱ����Զ���
	 * @param args
	 */
	public static void main(String[] args) {
		Point<Integer> p1=new Point<Integer>(1,2);
		int x1=p1.getX();
		System.out.println("x1:"+x1);
		//��ָ�����ͣ�����Ϊԭ��Object
		Point p2=p1;
		p2.setX("һ");
		String x2=(String)p2.getX();
		System.out.println("x2:"+x2);
		//ClassCastException
		x1=p1.getX();
		System.out.println("x1:"+x1);
	}

}
