package day06;
import java.util.Scanner;
//猜字符游戏
public class GuessingGame {
	//主方法
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //生成随机字符数组
		System.out.println(chs); //作弊
		int count = 0; //猜错的次数
		while(true){ //自造死循环 //exit
			System.out.println("猜吧!");
			String str = scan.next().toUpperCase(); //接收用户输入的字符串，并转换为大写字母
			if(str.equals("EXIT")){ //判断输入的是否是EXIT
				System.out.println("下次再来吧!");
				break;
			}
			char[] input = str.trim().toCharArray(); //去掉字符串两边的空格，并将其转换为字符数组
			int[] result = check(chs,input); //对比随机字符数组与用户输入的字符数组
			if(result[0]==chs.length){ //位置对个数为5表明猜对了
				int score = 100*chs.length-10*count; //每个字符100分，猜错一次扣10分
				System.out.println("恭喜你猜对了，得分为:"+score);
				break;
			}else{ //猜错了
				count++; //猜错次数增1
				System.out.println("字符对个数:"+result[1]+"，位置对个数:"+result[0]);
			}
		}
	}
	
	//生成随机字符数组
	public static char[] generate(){
		char[] chs = new char[5]; //随机字符数组
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //随机生成的字符的范围
		boolean[] flags = new boolean[letters.length]; //开关数组，默认值为false，表示字符未存过
		for(int i=0;i<chs.length;i++){ //遍历随机字符数组
			int index;
			do{
				index = (int)(Math.random()*letters.length); //生成随机字符数组下标
			}while(flags[index]==true); //当index下标对应的开关为true时，表示字符已存过，则重新生成index下标
			                            //当index下标对应的开头为false时，循环结束，false表示未存过，则可以继续存储
			chs[i] = letters[index]; //基于下标去letters中获取对应的字符，而后赋值给chs中的每一个元素
			flags[index]=true; //将下标对应的开头改为true，表明字符已存过
		}
		return chs ;
	}
	
	//对比:随机字符数组与用户输入的字符数组
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2]; //result[0]为位置对个数，result[1]为字符对个数
		for(int i=0;i<chs.length;i++){ //遍历随机字符数组
			for(int j=0;j<input.length;j++){ //遍历用户输入的字符数组
				if(chs[i]==input[j]){ //字符对
					result[1]++; //字符对个数增1
					if(i==j){ //位置对
						result[0]++; //位置对个数增1
					}
					break;
				}
			}
		}
		return result;
	}
}
















