package day06;
/**
 * �������ڲ���һ�����equals������hashCode��������д
 * ��HashMap����ΪKey�����equals������hashCode����
 * ��ִ�н����HashMap�Ĳ�ѯ�������ž���������
 * ������Key��hashCodeֵ��ͬ��put��HashMap��ʱ
 * ������key��equals�Ƚ�Ϊtrue��
 * ��ô�����滻value�Ĳ���
 * ������key��equals�Ƚ�Ϊfalse��
 * ��ô������HashMap�ڲ������ͬһ��λ�ã�
 * ��ʱ��λ���ϵ�����Entry���γ�����ṹ
 * ��������ή��HashMap�ļ������ܣ�Ӧ������
 * 
 * JavaAPI�ֲ��϶�����дObject��equals������equals������˵����
 * 1��hashCode��������ֵӦ����һ���ȶ�ֵ����˼�ǣ���һ�������в���
 * ��equals�����Ƚϵ�����ֵû�з����ı��ǰ���£���ε���hashCode����
 * ���ص�����Ӧ����ͬ
 * 2:��������дһ�����equals������Ӧ����ͬ��дhashCode��������Ӧ����ѭ��
 * ���������equals�����Ƚ�Ϊtrue����ôhashCodeֵӦ����ͬ
 * ���������equals�����Ƚ�Ϊfalse��hashCodeֵ��ò�ͬ�������Ӱ��
 * HashMap�Ĳ�ѯ����
 * 
 * Java�ṩ������Ϊkey��û�����⣬���Ƕ��Ѿ���д
 * @author Administrator
 *
 */
public class Key {
	private int x;
	private int y;
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
	public Key(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
