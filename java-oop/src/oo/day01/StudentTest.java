package oo.day01;
//ѧ����Ĳ�����
public class StudentTest {
	public static void main(String[] args) {
		//����ѧ������
		Student zs = new Student(); 
		//���ʳ�Ա����
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "�ӱ��ȷ�";
		//���÷���
		zs.study();
		zs.sayHi();
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "��������ľ˹";
		ls.study();
		ls.sayHi();
		
		//new֮�����г�Ա��������һ��Ĭ�ϵĳ�ʼֵ
		Student ww = new Student();
		ww.study();
		ww.sayHi();
	}
}








