package oo.day05;
//银行卡系统
public class UnionPayTest {
	public static void main(String[] args) {
		ICBCImpl card1 = new ICBCImpl();
		ICBC     card2 = new ICBCImpl();
		UnionPay card3 = new ICBCImpl(); //银联卡-工行卡
	}
}

interface UnionPay{ //银联接口
	public double getBalance(); //查询余额
	public boolean drawMoney(double number); //取钱
	public boolean checkPwd(String input); //检查密码
}
interface ICBC extends UnionPay{ //工行接口
	public void payOnline(double number); //在线支付
}
interface ABC extends UnionPay{ //农行接口
	public boolean payTelBill(String phoneNum,double sum); //支付电话费
}
class ICBCImpl implements ICBC{ //工行卡
	public double getBalance(){ return 0.0; }
	public boolean drawMoney(double number){ return false; }
	public boolean checkPwd(String input){ return false; }
	public void payOnline(double number){}
}
class ABCImpl implements ABC{ //农行卡
	public double getBalance(){ return 0.0; }
	public boolean drawMoney(double number){ return false; }
	public boolean checkPwd(String input){ return false; }
	public boolean payTelBill(String phoneNum,double sum){ return false; }
}


















