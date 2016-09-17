package day_fanshe;

import java.lang.reflect.Method;

public class JUnit3 {
	public static void main(String[] args) {
		JUnit3 junit3=new JUnit3();
		junit3.start("day_fanshe.TestCase");
	}
	/*
	 * 执行某个类中全部以test开头的方法
	 */
	public void start(String classname){
		Class cls;
		try {
			cls = Class.forName(classname);
			Object obj=cls.newInstance();
			Method[] all=cls.getDeclaredMethods();
			for(Method method:all){
			String name=method.getName();
			Class[] types=method.getParameterTypes();
			if(name.startsWith("test")&&types.length==0){
				method.invoke(obj, null);
			}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
