package com.learn.java.springjdbc;

public class Blogs {
	private int userNumber;
	private String userName;
	private String userPassword;
	private String userEmail;
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "Blogs [userNumber=" + userNumber + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userEmail=" + userEmail + "]";
	}
	
}
