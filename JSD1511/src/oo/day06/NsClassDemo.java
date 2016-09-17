package oo.day06;

public class NsClassDemo {
	public static void main(String[] args) {
		Inter6 o1=new Inter6(){
			
		};
		Inter7 o2=new Inter7(){
			public void run(){
				System.out.println("ABC");
			}
		};
		o2.run();
	}

}
interface Inter6{
	
}
interface Inter7{
	public void run();
}