package day04;
/**
 * ����
 * �����ǲ��������ͣ������ǽ�һ�����е����Ե�����
 * �������������ͣ���������ֵ�����͵Ķ���Ȩ�ӵ�ǰ�ཻ����
 * ʹ�õ�ǰ���ʹ���߾������Ӷ�����˴��������
 * @author Administrator
 *
 */
public class Point<E> {
	private E x;
	private E y;
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	public Point(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")"; 
	}
	
}
