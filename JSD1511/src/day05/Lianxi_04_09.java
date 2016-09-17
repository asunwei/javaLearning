package day05;
//有数列为：9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果。
public class Lianxi_04_09 {
	public static void main(String[] args) {
		long nine=0;
		long result=0;
		for(int i=1;i<=10;i++){
			nine=10*nine+9;
			result+=nine;
		}
		System.out.println("result="+result);
	}

}
