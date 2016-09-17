package day02;
/*
 * java�����е��඼ֱ�ӻ��߼�ӵļ̳���object��
 * object�� �ķ����ǱȽ��ٵ� 
 * */
public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/*
	 * ��������Ҫʹ�õ�ǰ��toString����ʱ��
	 * ��Ӧ����д�÷�������Ϊ��Object����̳�
	 * ������toString���ص��ַ���û���κ�����
	 * toString���ص��ַ�����ʽ���������弴��
	 * ͨ�����ص��ַ�����Ӧ������ǰ���������Ϣ
	 * �Ա�ͨ�����ַ��˽⵱ǰ����������Ϣ
	 * */
	public String toString(){
		return "("+x+","+y+")";
	}
	/*
	 * �������õ���ǰ���equals����ʱ����Ӧ����д�÷���
	 * ������Ƚ�ԭ��������д��ֱ��ʹ��Objec�ṩ�ķ������÷���ʹ��==�Ƚϵ�
	 * û��ʵ������
	 * */
	public boolean equals(Object obj){
		if (obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}else{
			return false;
		}
	}
	 
}
