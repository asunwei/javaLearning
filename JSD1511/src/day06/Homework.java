package day06;
//import java.util.Arrays;
//��ҵ����
public class Homework {
	public static void main(String[] args) {
		int count = 0; //������
		for(int num=2;num<=100;num++){
			boolean flag = true; //1.����������
			for(int i=2;i<=Math.sqrt(num);i++){ //2/3/4/.../9/10
				if(num%i==0){
					flag = false; //2.��ʾ��������
					break;
				}
			}
			if(flag){ //3.�жϵý���
				count++; //��һ�������������1
				System.out.print(num+"\t");
				if(count%10==0){ //ÿ10����һ��
					System.out.println();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int num = 100;
		boolean flag = true; //1.����������
		//for(int i=2;i<num;i++){  //2/3/4/.../98/99
		//for(int i=2;i<=num/2;i++){ //2/3/4/.../49/50
		for(int i=2;i<=Math.sqrt(num);i++){ //2/3/4/.../9/10
			if(num%i==0){
				flag = false; //2.��ʾ��������
				break;
			}
		}
		if(flag){ //3.�жϵý��� �൱��if(flag==true)
			System.out.println(num+"������");
		}else{
			System.out.println(num+"��������");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("��СֵΪ:"+min);
		
		int[] arr1 = new int[arr.length+1];
		System.arraycopy(arr,0,arr1,1,arr.length);
		arr1[0] = min;
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		*/
	}
}













