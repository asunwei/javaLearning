package lianxi;

public class MultiTypeDemo {
	public static void main(String[] args) {
		Boo b=new Boo();
		Aoo a=new Aoo();
		b=(Boo)a;
		Aoo o1=new Aoo();
		/*Aoo o1=new Boo();*/
		Boo o2=(Boo)o1;
		if(o1 instanceof Coo){
			Coo o3=(Coo)o1;
		}
	}

}
class Aoo{
	
}
interface Inter1{
	
}
class Boo extends Aoo implements Inter1{
	
}
class Coo extends Aoo{}