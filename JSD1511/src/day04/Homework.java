package day04;
//��ҵ����
public class Homework {
	public static void main(String[] args) {
		//6.������ݺ��·ݣ�������
		int year=2001; //���
		int month=5; //�·�
		int days=0; //����
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0){
				days=29;
			}else{
				days=28;
			}
		}
		System.out.println("days="+days);
		
		
		
		
		
		
		
		/*
		//5.��������˰
		double salary=10000; //����
		double taxSalary=salary-3500; //��˰����
		double tax=0.0; //Ӧ��˰��
		if(taxSalary<=0){ //����˰
			tax=0.0;
		}else if(taxSalary<=1500){
			tax=taxSalary*0.03-0;
		}else if(taxSalary<=4500){
			tax=taxSalary*0.1-105;
		}else if(taxSalary<=9000){
			tax=taxSalary*0.2-555;
		}else if(taxSalary<=35000){
			tax=taxSalary*0.25-1005;
		}
		System.out.println("Ӧ��˰:"+tax);
		*/
		
		/*
		//4.�ж�һ������Ƿ�������
		int year = 2001;
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
		*/
		
		
		/*
		 * ����:
		 * 1.������������/��Χ:
		 *     �ӱ�����������ʼ��������������Ĵ����Ž���
		 * 2.��������������:
		 *     �����������ص�ʱ����������ͬ��
		 */
		/*
		int a=5;
		if(a>2){
			//int a=55; //��������������ص�ʱ����ͬ��
			int b=8;
		}else{
			int b=88;
		}
		*/
		
		/*
		int a=5;
		if(a>2){
			int b=8;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		//System.out.println(b); //�������b�������÷�Χ��
		*/
		
		/*
		//3.������������
		int a=88,b=10,c=5;
		if(a>b){ //��֤a<b
			int t=a;
			a=b;
			b=t;
		}
		if(a>c){ //��֤a<c
			int t=a;
			a=c;
			c=t;
		}
		if(b>c){ //��֤b<c
			int t=b;
			b=c;
			c=t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		*/
		
		/*
		//2.������������
		int a=8,b=5;
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		*/
		
		/*
		//1.���������е����ֵ
		int a=55,b=8;
		int max=a>b?a:b;
		System.out.println("max="+max);
		*/
	}
}














