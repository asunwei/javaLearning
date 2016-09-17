package day06;
	/*求数组元素的最大值放在最后一位，要求如下：   
在上一案例基础之上，为程序添加功能：
将数组的长度扩容为 11，然后将查询到的数组最大值作为数组的最后一个元素，并打印扩容后的数组的内容。
修改:将数组长度扩容为12，
将最大值放在倒数第2位，将最小值放在倒数第1位*/

public class MeiYiLIan_05_06 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		int[] arr1=new int[12];
		System.arraycopy(arr,0,arr1,1,4);
		System.arraycopy(arr,4,arr1,6,6);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				int t=max; 
				max=arr[i];
				arr[i]=t;
			}
		}
		System.out.println("最大值为："+max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				int t=min;
				min=arr[i];
				arr[i]=t;
			}
		}
		System.out.println("最小值为："+min);
		arr1[0]=max;
		arr1[5]=min;
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  /*  int[] arr=new int[10];
   
    for(int i=0;i<arr.length;i++){
    arr[i]=(int)(Math=.random()*100);
    System.out.println(arr[i]);
    }
    int[] arr1= new int[12];
    System.arraycopy(arr,0,arr1,1,2);
    System.arraycopy(arr,2,arr1,4,8);
   
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
	   if(arr[i]>max){
		   int t=max;
		   max=arr[i];
		   arr[i]=t;
	   }
   }
   System.out.println("最大值"+max);
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
    	   if(arr[i]<min){
    		   int t=min;
    		   min=arr[i];
    		   arr[i]=t;
    	   }
      }
   System.out.println("最小值"+min);
   arr1[0]=max;
   arr1[3]=min;
      for(int j=0;j<arr1.length;j++){
    	   System.out.println(arr1[j]);*/
       }
   }

   
	


