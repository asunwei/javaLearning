package oo.day01;
//�������ͻ��Ⱥš�null
public class Demo {
	public static void main(String[] args) {
		Cell c1 = new Cell();
		Cell c2 = c1; //ָ��ͬһ������
		c1.row = 2;
		c2.row = 5;
		System.out.println(c1.row); //5
		
		c1 = null; //�գ���ָ���κζ���
		System.out.println(c1.row); //NullPointerException��ָ���쳣
	}
}












