package day06;

public class LianXi_05_04 {
	public static void main(String[] args) {
	int[] arr=new int[10];
	for(int i=1;i<arr.length;i++){
		arr[i]=(int)(Math.random()*100);
		System.out.println(arr[i]);
	}
	int min=arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
	System.out.println("最小值为"+min);
	
	int[] arr1=new int[11];
	System.arraycopy(arr,0,arr1,1,10);
	arr1[0]=min;
	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]);
	}
	}

}
