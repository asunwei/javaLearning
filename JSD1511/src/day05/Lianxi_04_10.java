package day05;
//1+1/2+1/3��+1/n��n>=2����Ҫ��ʹ�ý����ķ�ʽ��������еĺͣ��û��ڿ���̨
//¼����Ҫ��������� n ��ֵ�������������еĺͣ����ڿ���̨��������
import java.util.Scanner;
public class Lianxi_04_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������n��ֵ��");
		int n=scan.nextInt();
		double result=0;
		for(int i=1;i<=n;i++){
			result+=1.0/i;
		}
			System.out.println(result);
	}

}
