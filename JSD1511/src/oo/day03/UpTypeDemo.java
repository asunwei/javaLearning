package oo.day03;
//�������͵���ʾ
public class UpTypeDemo {
	public static void main(String[] args) {
		Coo o1 = new Coo(); //��ֻ�ܵ�����
		o1.c = 1;
		o1.show();
		
		Doo o2 = new Doo(); //�Ӽ��ܵ��ӵ�Ҳ�ܵ�����
		o2.d = 1;
		o2.say();
		o2.c = 2;
		o2.show();
		
		Coo o3 = new Doo(); //��������
		o3.c = 1;
		o3.show();
		//o3.d = 2; //��������ܵ����ʲô�������õ�����
	}
}

class Coo{
	int c;
	void show(){}
}
class Doo extends Coo{
	int d;
	void say(){}
}


















