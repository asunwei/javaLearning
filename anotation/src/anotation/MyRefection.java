package anotation;

import java.lang.reflect.Method;
 


public class MyRefection {
	public static void main(String[] args) throws Exception, NoSuchMethodException {
		MyTest myTest =  new MyTest();
		Class<MyTest> c = MyTest.class;
		Method method = c.getMethod("outPut", new Class[]{});
		if(method.isAnnotationPresent(MyAnnotation.class)){
			method.invoke(myTest, new Object[]{});
		    MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
		    String hello = myAnnotation.hello();
		    String world = myAnnotation.world();
		    String value = myAnnotation.value();
		    System.out.println(hello+","+world+","+value);
		}
	}
}
