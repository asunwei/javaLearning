package day05;
//import java.util.Arrays;
public class a {
	public static void main(String[] args) {
		int num=8;
		boolean flag=true;
		for(int i=2;i<9;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println(num+"是质数");
		}else{
			System.out.println(num+"不是质数");
		}
		
		
		
		
		
		
		
		
		
		
		
		/*int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		   // System.out.println(arr[i]);  
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		/*for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan=new Scanner(System.in);
		int score=0;
		for(int i=1;i<=10;i++){
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			System.out.println("("+i+")"+a+"+"+b+"="+"?");
		    int result=a+b;
			System.out.println("请输入答案");
			int guess=scan.nextInt();
			if(guess==-1){
				break;
			}else if(guess==result){
				System.out.println("猜对了");
				score+=10;
			}else{
				System.out.println("猜错了");
			}
		}
			System.out.println("下次光临，最终得分"+score);*/
		

		
/*		
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				int t=arr[i];
				arr[i]=min;
				min=t;
		}
		}
		System.out.println("最小值是"+min);*/
		
		
		
		/*int[] arr=new int[10];
		for(int i=1;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
//			System.out.println(arr[i]);
		}
		for(int k=0;k<arr.length-1;k++){
			for(int j=0;j<arr.length-1-k;j++){
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=arr.length-1;1>=0;i--){
			System.out.println(arr[i]);
		}*/
	}

}
