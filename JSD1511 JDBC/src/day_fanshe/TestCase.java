package day_fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;

public class TestCase {
	/*
	 * 动态加载calssname对应的类
	 * 找到这个类中声明的全部属性信息
	 */
	public void findFields(String classname) throws ClassNotFoundException{
		//动态加载类
		Class cls=Class.forName(classname);
		//cls代表类信息（方法区）
		//获取方法区加载的类的属性信息
		Field[] fields=cls.getDeclaredFields();
		for(Field field:fields){
			//找属性的名称和类型
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
	 * 获取一个类的所有构造器信息
	 */
	public void findCons(String classname) throws ClassNotFoundException{
		//Constructor:构造器
		Class cls=Class.forName(classname);
		Constructor[] all=cls.getDeclaredConstructors();
		for(Constructor c:all){
			System.out.println(c.getName()+" ");
			//构造器参数列表
			//Parameter:参数 Type：类型
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
	 * 获取一个类的所有方法信息
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
	 * 动态调用类的无参数构建器创建对象
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
	 * 调用某对象某方法,返回方法的返回值
	 * 动态调用了对象的某方法
	 */
	public Object call(Object obj,String methodName) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		//动态的获取一个对象的类型(方法区)
		Class cls=obj.getClass();
		//找到要调用的方法 invoke 在Method上
		//查找在类信息中查找方法名methodName的无参数的方法
		//可能出现异常（没有找到）
		//返回值是一个方法信息对象Method
		Method m=cls.getDeclaredMethod(methodName, new Class[]{});
		//动态调用方法，m.invoke(对象，向方法传递的参数)
		//作用：在对象上执行方法
		//返回值是方法执行的结果
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
	 * 动态获取某对象的某属性值
	 */
	public Object getValue(Object obj,String fieldName) throws Exception{
		//找到对象的类信息
		Class cls=obj.getClass();
		//找到属性信息
		Field field=cls.getDeclaredField(fieldName);
		//在对象上获取属性信息
		//field.get（对象）在对象上获取field对应的属性信息
		//返回属性的值
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
		
		Object v3=getValue(obj,"size");//报异常
	}
}
