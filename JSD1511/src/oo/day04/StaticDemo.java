package oo.day04;
//static����ʾ
public class StaticDemo {
	public static void main(String[] args) {
		Joo o1 = new Joo();
		o1.test();
		Joo o2 = new Joo();
		o2.test();
		System.out.println(Joo.b); //����ͨ������.������
		System.out.println(o1.b); //Ҳ����ͨ������.������
		
		Koo.say();
		
		Loo o3 = new Loo();
		Loo o4 = new Loo();
		Loo o5 = new Loo();
		
	}
}


class Loo{
	static{
		System.out.println("��̬��");
	}
	Loo(){
		System.out.println("���췽��");
	}
}



class Koo{
	int a;
	static int b;
	void show(){
		a = 1;
		b = 2;
	}
	static void say(){
		//��̬����û����ʽthis���ݣ�û��this��ζ��û�ж���
		//��ʵ������a����ͨ������������ʣ����Դ˴��������
		//a = 1; //�������
		b = 2;
	}
}




class Joo{
	int a;
	static int b;
	Joo(){
		a++;
		b++;
	}
	void test(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}












