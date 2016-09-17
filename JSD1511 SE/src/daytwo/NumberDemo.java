package daytwo;
public class NumberDemo {
	public static void main(String[] args) {
		double d=123.234;
		Double d1=Double.valueOf(d);
		int i=23;
		Integer i1=Integer.valueOf(i);
		Integer i2=Integer.valueOf(i);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		d=d1.doubleValue();
		System.out.println("d:"+d);
		i=d1.intValue();
		System.out.println("i:"+i);
		byte b=d1.byteValue();
		System.out.println("b:"+b);
		i=Integer.MAX_VALUE;
		long l=Long.MAX_VALUE;
	    b=Byte.MAX_VALUE;
		char c=Character.MAX_VALUE;
		
		String str="123";
		int i3=Integer.parseInt(str);
		System.out.println(i3);
		Integer i4=1;
		Integer i5=Integer.valueOf(1);
		int ii=i4;
		int ii1=i5.intValue();
		
	}
}
