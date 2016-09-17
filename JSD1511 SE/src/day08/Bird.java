package day08;

import java.io.Serializable;

/**
 * ʵ��Serializable�ӿڣ�����ʵ��һ����־
 * Java���������ҵ����Serializable��־
 * �Զ��ĶԶ����������������һ���Ƕ�����ķ���
 * һ����д����ķ���
 * ����Java�����������������������
 * �����Լ�ʵ���������������Զ������Ķ�д����
 * ����ο�Serializable�ӿ��ֲ�˵��
 * @author Administrator
 *
 */
public class Bird implements Serializable{
	int age=5;
	String name="Tom";
	/*transient ˲̬����
	 * �ڶ������л���ʱ����Զ������ԣ�
	 * ����Ҫ���л����ԣ�����ʹ��transient
	 * ���α������л�����ʡ�洢�ռ�
	 * �����л����Ϊnull*/
	transient String[] children={"jerry","poll"};
	public String toString(){
		return name+"��"+age+","+children;
	}
}
