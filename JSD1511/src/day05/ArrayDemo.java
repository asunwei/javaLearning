package day05;
import java.util.Arrays;
//�������ʾ
public class ArrayDemo {
	public static void main(String[] args) {
		//6.���������
		int[] arr = {23,45,4,27,5,87,9}; 
		for(int i=0;i<arr.length-1;i++){ //��������
			for(int j=0;j<arr.length-1-i;j++){ //����ÿ�ֱȽϵĴ���
				if(arr[j]>arr[j+1]){ //ÿһ�ζ��Ǻ�������һ��Ԫ�ر�
					int t=arr[j]; //���������򽻻�
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				//��ǰ�����ں����򽻻�����֤ǰ��С�ں���--����
				//��ǰ��С�ں����򽻻�����֤ǰ�����ں���--����
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr = {26,34,1,3,68};
		Arrays.sort(arr); //��arr��������
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		
		
		
		/*
		//5.����ĸ���
		int[] a = {10,20,30,40,50};
		//���������(����һ���µ�����)
		a = Arrays.copyOf(a,a.length+1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		
		
		/*
		int[] a = {10,20,30,40,50};
		//a:Դ����
		//a1:Ŀ������
		//6:Ŀ������ĳ���
		int[] a1 = Arrays.copyOf(a,6);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		
		
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6];
		//a:Դ����
		//1:Դ�������ʼ�±�
		//a1:Ŀ������
		//0:Ŀ���������ʼ�±�
		//4:Ҫ���Ƶ�Ԫ�صĸ���
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * �������ϰ:
		 * 1.����int������arr������4��Ԫ��
		 * 2.����int������arr1��ֱ�ӳ�ʼ��Ϊ1,3,4,6
		 *   ����int������arr2����new����ֱ�ӳ�ʼ��Ϊ1,3,4,6
		 * 3.���arr�ĳ���
		 *   ���arr�е�һ��Ԫ�ص�ֵ
		 *   ��arr�����һ��Ԫ�ظ�ֵΪ250(�±겻��д��)
		 *   arr[4]=500;-------???
		 * 4.������MaxOfArray����main()��������:
		 *     ����int������arr������10��Ԫ��
		 *     ��arr��ÿһ��Ԫ�ظ�ֵΪ0��99֮��������
		 *     ���arr�е�ÿһ��Ԫ��
		 *   
		 */
		
		/*
		//4.����ı���
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){ //����arr����
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//3.����ķ���
		int[] arr = new int[3];
		System.out.println(arr.length); //3
		arr[0] = 100; //��arr�е�һ��Ԫ�ظ�ֵΪ100
		arr[1] = 200;
		arr[2] = 300;
		//arr[3] = 400; //�����±�Խ���쳣
		System.out.println(arr[arr.length-1]); //���arr�����һ��Ԫ�ص�ֵ
		*/
		
		/*
		//2.����ĳ�ʼ��
		int[] arr = new int[3]; //0,0,0
		int[] arr1 = {1,3,5};   //1,3,5
		int[] arr2 = new int[]{1,3,5}; //1,3,5
		int[] arr3;
		//arr3 = {1,3,5}; //�������ֻ������ͬʱ��ʼ��
		arr3 = new int[]{1,3,5}; //��ȷ
		*/
		
		/*
		//1.����Ķ���
		int[] arr = new int[10];
		*/
	}
}













