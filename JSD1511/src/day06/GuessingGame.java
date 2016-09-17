package day06;
import java.util.Scanner;
//���ַ���Ϸ
public class GuessingGame {
	//������
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //��������ַ�����
		System.out.println(chs); //����
		int count = 0; //�´�Ĵ���
		while(true){ //������ѭ�� //exit
			System.out.println("�°�!");
			String str = scan.next().toUpperCase(); //�����û�������ַ�������ת��Ϊ��д��ĸ
			if(str.equals("EXIT")){ //�ж�������Ƿ���EXIT
				System.out.println("�´�������!");
				break;
			}
			char[] input = str.trim().toCharArray(); //ȥ���ַ������ߵĿո񣬲�����ת��Ϊ�ַ�����
			int[] result = check(chs,input); //�Ա�����ַ��������û�������ַ�����
			if(result[0]==chs.length){ //λ�öԸ���Ϊ5�����¶���
				int score = 100*chs.length-10*count; //ÿ���ַ�100�֣��´�һ�ο�10��
				System.out.println("��ϲ��¶��ˣ��÷�Ϊ:"+score);
				break;
			}else{ //�´���
				count++; //�´������1
				System.out.println("�ַ��Ը���:"+result[1]+"��λ�öԸ���:"+result[0]);
			}
		}
	}
	
	//��������ַ�����
	public static char[] generate(){
		char[] chs = new char[5]; //����ַ�����
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //������ɵ��ַ��ķ�Χ
		boolean[] flags = new boolean[letters.length]; //�������飬Ĭ��ֵΪfalse����ʾ�ַ�δ���
		for(int i=0;i<chs.length;i++){ //��������ַ�����
			int index;
			do{
				index = (int)(Math.random()*letters.length); //��������ַ������±�
			}while(flags[index]==true); //��index�±��Ӧ�Ŀ���Ϊtrueʱ����ʾ�ַ��Ѵ��������������index�±�
			                            //��index�±��Ӧ�Ŀ�ͷΪfalseʱ��ѭ��������false��ʾδ���������Լ����洢
			chs[i] = letters[index]; //�����±�ȥletters�л�ȡ��Ӧ���ַ�������ֵ��chs�е�ÿһ��Ԫ��
			flags[index]=true; //���±��Ӧ�Ŀ�ͷ��Ϊtrue�������ַ��Ѵ��
		}
		return chs ;
	}
	
	//�Ա�:����ַ��������û�������ַ�����
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2]; //result[0]Ϊλ�öԸ�����result[1]Ϊ�ַ��Ը���
		for(int i=0;i<chs.length;i++){ //��������ַ�����
			for(int j=0;j<input.length;j++){ //�����û�������ַ�����
				if(chs[i]==input[j]){ //�ַ���
					result[1]++; //�ַ��Ը�����1
					if(i==j){ //λ�ö�
						result[0]++; //λ�öԸ�����1
					}
					break;
				}
			}
		}
		return result;
	}
}
















