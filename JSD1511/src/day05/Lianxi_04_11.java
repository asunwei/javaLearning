package day05;
//1)	ʹ��forѭ����ʽ������������ݵĺ�:   (10)
//1+3+5+7+...+97+99

public class Lianxi_04_11 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum+=i;
				
			}
		}
		System.out.println(sum);
		}
}
