package day06;
	/*������Ԫ�ص����ֵ�������һλ��Ҫ�����£�   
����һ��������֮�ϣ�Ϊ������ӹ��ܣ�
������ĳ�������Ϊ 11��Ȼ�󽫲�ѯ�����������ֵ��Ϊ��������һ��Ԫ�أ�����ӡ���ݺ����������ݡ�
�޸�:�����鳤������Ϊ12��
�����ֵ���ڵ�����2λ������Сֵ���ڵ�����1λ*/

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
		System.out.println("���ֵΪ��"+max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				int t=min;
				min=arr[i];
				arr[i]=t;
			}
		}
		System.out.println("��СֵΪ��"+min);
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
   System.out.println("���ֵ"+max);
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
    	   if(arr[i]<min){
    		   int t=min;
    		   min=arr[i];
    		   arr[i]=t;
    	   }
      }
   System.out.println("��Сֵ"+min);
   arr1[0]=max;
   arr1[3]=min;
      for(int j=0;j<arr1.length;j++){
    	   System.out.println(arr1[j]);*/
       }
   }

   
	


