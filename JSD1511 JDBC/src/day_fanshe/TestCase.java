package day_fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;

public class TestCase {
	/*
	 * ��̬����calssname��Ӧ����
	 * �ҵ��������������ȫ��������Ϣ
	 */
	public void findFields(String classname) throws ClassNotFoundException{
		//��̬������
		Class cls=Class.forName(classname);
		//cls��������Ϣ����������
		//��ȡ���������ص����������Ϣ
		Field[] fields=cls.getDeclaredFields();
		for(Field field:fields){
			//�����Ե����ƺ�����
			System.out.print(field.getType()+" ");
			System.out.println(field.getName());
		}
	}
	
//	@Test
	public void testFields() throws ClassNotFoundException{
		//String classname = ;
		findFields("day_fanshe.Foo");
		
	}
	
	/*
	 * ��ȡһ��������й�������Ϣ
	 */
	public void findCons(String classname) throws ClassNotFoundException{
		//Constructor:������
		Class cls=Class.forName(classname);
		Constructor[] all=cls.getDeclaredConstructors();
		for(Constructor c:all){
			System.out.println(c.getName()+" ");
			//�����������б�
			//Parameter:���� Type������
			Class[] types=c.getParameterTypes();
			System.out.println(Arrays.toString(types));
		}
	}
//	@Test
	public void testCons() throws ClassNotFoundException{
		String classname="day_fanshe.Foo";
		findCons(classname);
	}
	
	/*
	 * ��ȡһ��������з�����Ϣ
	 */
	public void findMethod(String classname) throws ClassNotFoundException{
		Class cls=Class.forName(classname);
		Method[] mt=cls.getDeclaredMethods();
		for(Method m:mt){
			System.out.print(m.getName()+" ");
			System.out.println(m.getReturnType());
		}
		
	}
//	@Test 
	public void testMothod() throws ClassNotFoundException{
		String classname="day_fanshe.Foo";
		findMethod(classname);
	}
	
	
	
	/*
	 * ��̬��������޲�����������������
	 */
	public Object newOne(String classname) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls=Class.forName(classname);
		Object obj=cls.newInstance();
		return obj;
	}
//	@Test
	public void testNewOne() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		String classname="day_fanshe.Foo";
		Object o1=newOne(classname);
		classname="java.util.ArrayList";
		Object o2=newOne(classname);
		classname="java.io.BufferedInputStream";
		Object o3=newOne(classname);
	}
	
	/*
	 * ����ĳ����ĳ����,���ط����ķ���ֵ
	 * ��̬�����˶����ĳ����
	 */
	public Object call(Object obj,String methodName) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		//��̬�Ļ�ȡһ�����������(������)
		Class cls=obj.getClass();
		//�ҵ�Ҫ���õķ��� invoke ��Method��
		//����������Ϣ�в��ҷ�����methodName���޲����ķ���
		//���ܳ����쳣��û���ҵ���
		//����ֵ��һ��������Ϣ����Method
		Method m=cls.getDeclaredMethod(methodName, new Class[]{});
		//��̬���÷�����m.invoke(�����򷽷����ݵĲ���)
		//���ã��ڶ�����ִ�з���
		//����ֵ�Ƿ���ִ�еĽ��
		Object val=m.invoke(obj, null);
		return val;
	}
//	@Test
	public void testCall() throws Exception{
		String s="abc";
		//length() toString() trim() toUpperCase()
		Object obj=call(s,"toUpperCase");
		System.out.println(obj);
		Object o=call(s,"toString");
		System.out.println(o);
	}
	
	/*
	 * ��̬��ȡĳ�����ĳ����ֵ
	 */
	public Object getValue(Object obj,String fieldName) throws Exception{
		//�ҵ����������Ϣ
		Class cls=obj.getClass();
		//�ҵ�������Ϣ
		Field field=cls.getDeclaredField(fieldName);
		//�ڶ����ϻ�ȡ������Ϣ
		//field.get�������ڶ����ϻ�ȡfield��Ӧ��������Ϣ
		//�������Ե�ֵ
		Object v=field.get(obj);
		return v;
	}
	@Test
	public void testGetValue() throws Exception{
		Object obj=new Foo(8,"TOM");
		Object v1=getValue(obj,"age");
		Object v2=getValue(obj,"name");
		System.out.println(v1);
		System.out.println(v2);
		
		Object v3=getValue(obj,"size");//���쳣
	}
}
