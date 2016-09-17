package day04;
//for循环的演示
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
				continue; //跳过剩余语句而进入下一次循环(去到num++)
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
		for(;;){ //死循环
			System.out.println("我要学习");
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
		//求1到100的累加和 1+2+3+...+99+100=?
		int sum=0; //和
		for(int num=1;num<=100;num++){
			sum+=num; //在本身基础之上操作
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * 执行过程:
		 *       sum=0
		 * num=1 sum=1
		 * num=2 sum=1+2
		 * num=3 sum=1+2+3
		 * num=4 sum=1+2+3+4
		 * ...
		 * num=100 sum=1+2+3+4+...+100
		 * num=101 false for循环结束
		 */
		
		
		
		
		
		
		/*
		for(int count=0;count<10;count++){
			System.out.println("行动是成功的阶梯");
		}
		System.out.println("over");
		*/
		/*
		 * 执行过程:
		 * count=0 true 输出
		 * count=1 true 输出
		 * count=2 true 输出
		 * ....
		 * count=9 true 输出
		 * count=10 false for循环结束
		 * 输出over
		 */
		/*
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		System.out.println("over");
		*/
	}
}














