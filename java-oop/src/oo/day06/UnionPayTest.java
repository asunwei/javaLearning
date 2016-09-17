package oo.day06;
//ũ��ATMϵͳ
public class UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM(); //atm������
		UnionPay card = new ABCImpl(); //������-ũ�п�
		atm.insertCard(card); //�忨
		atm.payTelBill(); //֧���绰��
	}
}
class ABCATM{ //ũ��ATM��
	private UnionPay card; //������
	public void insertCard(UnionPay card){ //�忨
		this.card = card;
	}
	public void payTelBill(){ //�൱��һ����ť
		if(card instanceof ABC){ //ũ�п�
			ABC abcCard = (ABC)card; //��������ǿתΪũ�п�
			abcCard.payTelBill("12345678945", 300);
		}else{
			System.out.println("����ũ�п�������֧���绰��");
		}
	}
}










class ABCImpl implements ABC{ //ũ�п�
	public double getBalance(){ return 0.0; }
	public boolean drawMoney(double number){ return false; }
	public boolean checkPwd(String input){ return false; }
	public boolean payTelBill(String phoneNum,double sum){
		System.out.println("֧���绰�ѳɹ�");
		return false; 
	}
}














interface UnionPay{ //�����ӿ�
	public double getBalance(); //��ѯ���
	public boolean drawMoney(double number); //ȡǮ
	public boolean checkPwd(String input); //�������
}
interface ICBC extends UnionPay{ //���нӿ�
	public void payOnline(double number); //����֧��
}
interface ABC extends UnionPay{ //ũ�нӿ�
	public boolean payTelBill(String phoneNum,double sum); //֧���绰��
}
class ICBCImpl implements ICBC{ //���п�
	public double getBalance(){ return 0.0; }
	public boolean drawMoney(double number){ return false; }
	public boolean checkPwd(String input){ return false; }
	public void payOnline(double number){}
}



















