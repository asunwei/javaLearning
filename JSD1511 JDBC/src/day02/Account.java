package day02;

public class Account {
	private int id;
	private String name;
	private String pwd;
	private String mobile;
	private double balance;
	public Account(){
		
	}
	public Account(int id, String name, String pwd, String mobile,
			double balance) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.mobile = mobile;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", pwd="
				+ pwd + ", mobile=" + mobile + ", balance=" + balance + "]";
	}
	
}
