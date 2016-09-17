package anotation;

public class MyTest {
	@MyAnnotation(hello = "shanghai",world = "pudong",value="qq")
	@Deprecated
	@SuppressWarnings("unchecked")
	 public void outPut(){
		 System.out.println("output something");
	 }
}
