package oo.day04;
//final����ʾ
public class FinalDemo {
	public static void main(String[] args) {
	}
}


final class Poo{}
//class Qoo extends Poo{} //�������final���಻�ܱ��̳�
class Roo{}
final class Soo extends Roo{}



class Noo{
	void show(){}
	final void say(){}
}
class Ooo extends Noo{
	void show(){}
	//void say(){} //�������final�ķ������ܱ���д
}



/*
 * final���γ�Ա����:
 * 1)����ͬʱ��ʼ�������ڹ��췽���г�ʼ��
 * final���ξֲ�����:
 * 1)��֮ǰ��ʼ������(���ÿ��Բ���ʼ��)
 */
class Moo{
	final int a = 5;
	final int b;
	Moo(){
		b = 5;
	}

	void show(){
		final int c;
		//System.out.println(c); //�������ʹ��֮ǰ�����ʼ��
		//a = 55; //�������final�ı������ܱ��ı�
	}
}







