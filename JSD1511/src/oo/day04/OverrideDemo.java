package oo.day04;
//��д����ʾ
public class OverrideDemo {
	public static void main(String[] args) {
		/*
		 * ��д��ѭ"��ͬ��Сһ��"ԭ��:һ�㶼����ȫ��ͬ��
		 * 1.��ͬ:
		 *   1)��������ͬ
		 *   2)�����б���ͬ
		 * 2.��С:
		 *   1)����ķ���ֵ����С�ڻ���ڸ����
		 *     1.1)�������ͺ�voidʱ��������ͬ
		 *     1.2)��������ʱ��С�ڻ����
		 *   2)�����׳����쳣С�ڻ���ڸ����--�쳣֮��
		 * 3.һ��:
		 *   1)����ķ���Ȩ�޴��ڻ���ڸ����--���ʿ������η���
		 */
	}
}

//���������С
class Aoo{
	void show(){}
	double say(){return 0.0;}
	Aoo get(){return null;}
	Boo test(){return null;}
}
class Boo extends Aoo{
	void show(){} //voidʱ������ͬ
	double say(){return 2.2;} //��������ʱ������ͬ
	//Boo get(){return null;} //��ȷ�ģ�С��
	//Aoo test(){return null;} //����ģ�ֻ��С�ڻ����
}








