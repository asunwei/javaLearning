package oo.day06;
public class UnionPayTest1 {
	public static void main(String[] args) {
		ABCATM atm=new ABCATM();
		UnionPay card=new ABCImp1(2000,"1234456");
		atm.insertCard(card);
		atm.payTelBill();
	}

}
class ABCATM{
	private UnionPay card;
	public void insertCard(UnionPay card){
		this.card=card;
	}
	public void payTelBill(){
		if(card instanceof ABC){
			ABC abcCard=(ABC)card;
			abcCard.payTelBill("11111111111", 200);
		}else{
			System.out.println("不是农行卡，不能支付话费");
		}
	}
}

class ABCImp1 implements ABC{
	private double balance;
	private String password;
	public ABCImp1(double balance,String password){
		this.balance=balance;
		this.password=password;
	}
	public double getBalance(){
		return balance;
		}
	public boolean drawMoney(double number){
		if(balance-number>=-2000){
			return true;
		}
		return false;
		}
	public boolean checkPwd(String input){
		if(password.equals(input)){
			return true;
		}else{
			return false;
		}
		}
	public boolean payTelBill(String phoneNumber,double sum){
		System.out.println("支付电话费成功");
		/*if(phoneNumber.length()==11&&(balance-sum>=-2000)){
			balance-=sum;
			return true;
		}*/
		return false;
		}
}

interface UnionPay{
	public double getBalance();
	public boolean drawMoney(double number);
	public boolean checkPwd(String input);
}
interface ICBC extends UnionPay{
	public void payOnline(double number);
}
interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNumber,double sum);
}

class ICBCImp1 implements ICBC{
	private double money;
	private String pwd;
	public ICBCImp1(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalance(){
		return money;
		}
	public boolean drawMoney(double number){
		if(number<=money){
			money-=number;
			return true;
		}
		return false;
		}
	public boolean checkPwd(String input){
		if(pwd.equals(input)){
			return true;
		}else{
			return false;
		}
		}
	public void payOnline(double number){
		if(number<money){
			money-=number;
		}
	}
}

