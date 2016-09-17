package day06;
import java.util.Scanner;
public class GuessingGame_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char[] chs=generate();
		System.out.println(chs);
		int count=0;
		while(true){
			System.out.println("�°�");
			String str=scan.next().toUpperCase();
			if(str.equals("EXIT")){
				System.out.println("�´��ټ�");
				break;
			}
			char[] input=str.toCharArray();
			int[] result=check(chs,input) ;
			if(result[0]==chs.length){
				int score=100*chs.length-10*count;
				System.out.println("��ϲ�㣬�¶��ˣ��÷�Ϊ"+score);
			}else{
				count++;
				System.out.println("�ַ��Ը���"+result[1]+"��λ�öԸ���"+result[0]);
			}
		}
		}
	public static char[] generate(){
		char[] chs=new char[5];
		char[] letters={'A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };
		boolean[] flags=new boolean[letters.length];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index=(int)(Math.random()*letters.length);
			}while(flags[index]==true);
			chs[i]=letters[index];
			flags[index]=true;
		}
		
		return chs;
	}

    public static int[] check(char[] chs,char[] input){
    	int[] result=new int[2];//result[0]λ�öԸ�����result[1]�ַ��Ը���
    	for(int i=0;i<chs.length;i++){
    		for(int j=0;j<input.length;j++){
    			if(chs[i]==input[j]){
    				result[1]++;
    				if(i==j){
    					result[0]++;
    				}
    				break;
    			}
    		}
    	}
    	return result;
    }
}