package oo.day06;
//��Ա�ڲ�����ʾ
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		m.createBaby();
		//Baby b = new Baby(); //��������ڲ�����ⲻ�߱��ɼ���
	}
}

class Mama{
	private String name;
	Baby createBaby(){
		return new Baby();//return Baby������÷���ֵ���͵Ķ���
	}
	public void run(){
		System.out.println("run");
	}
	class Baby{
		void Baby(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //thisΪ��ǰ���󣬼�Baby����󣬶�Baby��û��name����
			run();
		}
		
	}
}






