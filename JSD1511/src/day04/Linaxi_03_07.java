package day04;
//�ж��·ݣ��������
import java.util.Scanner;
public class Linaxi_03_07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=scan.nextInt();
		System.out.println("�������·ݣ�");
		int month=scan.nextInt();
		int day=0;
		if (year<0||(month<=0||month>12)){
			System.out.println("�����������");
		}else{
			switch(month){
			case 2:
				if((year%4==0&&year%100!=0)||year%400==0){
					day=29;
				}else{
					day=28;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			   day=31;
			break;
			default:
				day=30;
			}
			System.out.println(year+"��"+month+"��"+day+"��");
		}
	}

}
