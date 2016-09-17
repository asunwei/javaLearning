package controller;
/**
 *封装请求参数类
 * 要求如下：
 * a.属性名和请求参数一致
 * b.提供相应的get/set方法
 */
public class User {
	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
