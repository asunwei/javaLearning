package day05;
/**
 * ���������ڲ�����Ϊ����Ԫ��ʱ�Լ��ϵ�����
 * ������
 * @author Administrator
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	public Point(){
		
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
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * �÷����������������жϵ�ǰ����������Ĳ�������Ƚϴ�Сʹ��
	 * 
	 * ����ֵ�����ľ���ȡֵ��ֻ����ȡֵ��Χ
	 * ������ֵ>0����ǰ����Ȳ��������
	 * ������ֵ<0:��ǰ����Ȳ�������С
	 * ������ֵ=0�������������
	 */
	@Override
	public int compareTo(Point o) {
		//��ǰ�㵽ԭ��ľ���
		int len=this.x*this.x+this.y*this.y;
		//��ǰo�㵽ԭ��ľ���
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}
}
