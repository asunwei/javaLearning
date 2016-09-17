package day05;

public class MaoPaoDemo {
	public static void main(String[] args) {
     int[] arr=new int[10];
     for(int i=0;i<arr.length;i++){
    	 arr[i]=(int)(Math.random()*100);
     }
    	 for(int j=0;j<arr.length-1;j++){
    		 for(int k=0;k<arr.length-1-j;k++){
    			 if(arr[k]>arr[k+1]){
    				 int t=arr[k];
    				 arr[k]=arr[k+1];
    				 arr[k+1]=t;
    			 }
    		 }
    	 }
    	 for(int i=0;i<arr.length;i++){
    		 System.out.println(arr[i]); 
    	 }
	}
}
