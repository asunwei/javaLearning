package day05;
//9*9乘法表三种格式表现形式
public class NstFor_1 {
	public static void main(String[] args) {
		int num=1;
		do{
			int i=1;
			do{
				System.out.print(i+"*"+num+"="+i*num+"\t");
				i++;
		}while(i<=num);
			System.out.println();
			num++;
		}while(num<=9);
		/*int num=1;
		while(num<=9){
			int i=1;
			while(i<=num){
				System.out.print(i+"*"+num+"="+i*num+"\t");
				i++;
			}
			System.out.println();
			num++;
		}*/
		/*for(int num=1;num<=9;num++){
			for(int i=1;i<=num;i++){
				System.out.print(i+"*"+num+"="+i*num+"\t");
			}
             System.out.println();
		}
		*/
	}		

}
