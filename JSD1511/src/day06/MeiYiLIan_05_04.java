package day06;
/*1)	�žų˷���Ҫ�����£�     
�ڽ����ӡ�žų˷���
�޸�: ��ӡ1,3,5,7,9�ĳ˷���*/
public class MeiYiLIan_05_04 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
				System.out.print(j+"*"+i+"="+i*j+"\t");
				}
			}
			System.out.println();
		}
	}

}
