package day05;
//数组的演示
public class ArrayDemo_1 {
	public static void main(String[] args) {
		/*int[] arr=new int[4];
		int[] arr1={1,3,4,6};
		int[] arr2=new int[]{1,3,4,6};
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		arr[arr.length-1]=250;
		arr[4]=500;
		*/
	/*	int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
				arr[i]=(int)(Math.random()*100);
				System.out.println(arr[i]);
	}*/
		int[] arr=new int[10];
		for(int i=arr.length-1;i>=0;i--){
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]);
	}

}
}
