package day04;
//forѭ������ʾ
public class ForDemo {
	public static void main(String[] args) {
		int sum=0; 
		for(int num=1;num<=100;num++){
			if(num%10!=3){
				sum+=num;
			}
		}
		System.out.println("sum="+sum);
		
		
		/*
		int sum=0; 
		for(int num=1;num<=100;num++){
			if(num%10==3){ //3,13,23,33...
				continue; //����ʣ������������һ��ѭ��(ȥ��num++)
			}
			sum+=num;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * num=1 sum=1
		 * num=2 sum=1+2
		 * num=3
		 * num=4 sum=1+2+4
		 */
		
		
		
		
		
		
		/*
		int sum=0; 
		int num=1;
		for(;num<=100;num++){
			sum+=num;
		}
		System.out.println("sum="+sum);
		*/
		/*
		int sum=0; 
		for(int num=1;num<=100;){
			sum+=num;
			num++;
		}
		System.out.println("sum="+sum);
		*/
		/*
		int sum=0; 
		int num=1;
		for(;num<=100;){
			sum+=num;
			num++;
		}
		System.out.println("sum="+sum);
		*/
		/*
		for(;;){ //��ѭ��
			System.out.println("��Ҫѧϰ");
		}
		*/
		/*
		for(int i=0,j=6;i<5;i+=2,j-=2){
		}
		*/
		/*
		 * i=0,j=6
		 * i=2,j=4
		 * i=4,j=2
		 * i=6,j=0
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//��1��100���ۼӺ� 1+2+3+...+99+100=?
		int sum=0; //��
		for(int num=1;num<=100;num++){
			sum+=num; //�ڱ������֮�ϲ���
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * ִ�й���:
		 *       sum=0
		 * num=1 sum=1
		 * num=2 sum=1+2
		 * num=3 sum=1+2+3
		 * num=4 sum=1+2+3+4
		 * ...
		 * num=100 sum=1+2+3+4+...+100
		 * num=101 false forѭ������
		 */
		
		
		
		
		
		
		/*
		for(int count=0;count<10;count++){
			System.out.println("�ж��ǳɹ��Ľ���");
		}
		System.out.println("over");
		*/
		/*
		 * ִ�й���:
		 * count=0 true ���
		 * count=1 true ���
		 * count=2 true ���
		 * ....
		 * count=9 true ���
		 * count=10 false forѭ������
		 * ���over
		 */
		/*
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		System.out.println("over");
		*/
	}
}














