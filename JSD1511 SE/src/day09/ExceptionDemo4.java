package day09;
/**
 * 
 * @author Administrator
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		System.out.println("����ʼ�ˣ�");
		try{
			String str=null;
			System.out.println(str.length());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("���������");
		
	}
}
