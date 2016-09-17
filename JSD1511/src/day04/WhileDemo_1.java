package day04;
public class WhileDemo_1 {
	public static void main(String[] args) {
		int num=1;
		while(num<=9){
			System.out.println(num+"*"+9+"="+num*9);
			num++;
		}
		System.out.println("over");
		/*运行过程：
		num=1   1*9=9
		num=2   2*9=18
		num=3   3*9=27
		num=4   4*9=36
		num=5   5*9=45
		num=6   6*9=54
		num=7   7*9=63
		num=8   8*9=72
		num=9   9*9=81*/
		/*int count=0;
		while(count<10){
			System.out.println("行动 是成功的阶梯");
			count++;
		}
		System.out.println("over");*/
	}

}