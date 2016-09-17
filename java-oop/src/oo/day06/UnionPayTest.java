package oo.day06;
//农行ATM系统
public class UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM(); //atm机对象
		UnionPay card = new ABCImpl(); //银联卡-农行卡
		atm.insertCard(card); //插卡
		atm.payTelBill(); //支付电话费
	}
}
class ABCATM{ //农行ATM机
	private UnionPay card; //银联卡
	public void insertCard(UnionPay card){ //插卡
		this.card = card;
	}
	public void payTelBill(){ //相当于一个按钮
		if(card instanceof ABC){ //农行卡
			ABC abcCard = (ABC)card; //将银联卡强转为农行卡
			abcCard.payTelBill("12345678945", 300);
		}else{
			System.out.println("不是农行卡，不能支付电话费");
		}
	}
}










class ABCImpl implements ABC{ //农行卡
	public double getBalance(){ return 0.0; }
	public boolean drawMoney(double number){ return false; }
	public boolean checkPwd(String input){ return false; }
	public boolean payTelBill(String phoneNum,double sum){
		System.out.println("支付电话费成功");
		return false; 
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



















