package day02;
/*
 * 字符串支持正则表达式方法二：
 * String[] split(String regex)
 * 将当前的字符串中满足正则表达式的部分进行拆分
 * 然后将所有的拆分的内容以一个字符串数组形式返回
 * */
public class StringDemo3 {
	public static void main(String[] args) {
		String str="123,456,789,012";
		String[] arr=str.split(",");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		String imageName="a.jpg";
		String[] names=imageName.split("\\.");
		imageName=System.currentTimeMillis()+"."+names[1];
		System.out.println(imageName);
	}
}
