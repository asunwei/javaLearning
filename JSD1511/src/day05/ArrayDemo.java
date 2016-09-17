package day05;
import java.util.Arrays;
//数组的演示
public class ArrayDemo {
	public static void main(String[] args) {
		//6.数组的排序
		int[] arr = {23,45,4,27,5,87,9}; 
		for(int i=0;i<arr.length-1;i++){ //控制轮数
			for(int j=0;j<arr.length-1-i;j++){ //控制每轮比较的次数
				if(arr[j]>arr[j+1]){ //每一次都是和它的下一个元素比
					int t=arr[j]; //符合条件则交换
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				//若前数大于后数则交换，保证前数小于后数--升序
				//若前数小于后数则交换，保证前数大于后数--降序
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr = {26,34,1,3,68};
		Arrays.sort(arr); //对arr升序排列
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		
		
		
		/*
		//5.数组的复制
		int[] a = {10,20,30,40,50};
		//数组的扩容(创建一个新的数组)
		a = Arrays.copyOf(a,a.length+1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		
		
		/*
		int[] a = {10,20,30,40,50};
		//a:源数组
		//a1:目标数组
		//6:目标数组的长度
		int[] a1 = Arrays.copyOf(a,6);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		
		
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6];
		//a:源数组
		//1:源数组的起始下标
		//a1:目标数组
		//0:目标数组的起始下标
		//4:要复制的元素的个数
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 数组的练习:
		 * 1.声明int型数组arr，包含4个元素
		 * 2.声明int型数组arr1，直接初始化为1,3,4,6
		 *   声明int型数组arr2，先new后再直接初始化为1,3,4,6
		 * 3.输出arr的长度
		 *   输出arr中第一个元素的值
		 *   给arr中最后一个元素赋值为250(下标不能写死)
		 *   arr[4]=500;-------???
		 * 4.创建类MaxOfArray，在main()大括号中:
		 *     声明int型数组arr，包含10个元素
		 *     给arr中每一个元素赋值为0到99之间的随机数
		 *     输出arr中的每一个元素
		 *   
		 */
		
		/*
		//4.数组的遍历
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){ //遍历arr数组
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//3.数组的访问
		int[] arr = new int[3];
		System.out.println(arr.length); //3
		arr[0] = 100; //给arr中第一个元素赋值为100
		arr[1] = 200;
		arr[2] = 300;
		//arr[3] = 400; //数组下标越界异常
		System.out.println(arr[arr.length-1]); //输出arr中最后一个元素的值
		*/
		
		/*
		//2.数组的初始化
		int[] arr = new int[3]; //0,0,0
		int[] arr1 = {1,3,5};   //1,3,5
		int[] arr2 = new int[]{1,3,5}; //1,3,5
		int[] arr3;
		//arr3 = {1,3,5}; //编译错误，只能声明同时初始化
		arr3 = new int[]{1,3,5}; //正确
		*/
		
		/*
		//1.数组的定义
		int[] arr = new int[10];
		*/
	}
}













