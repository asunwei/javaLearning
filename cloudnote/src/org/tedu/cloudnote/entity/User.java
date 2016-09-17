package org.tedu.cloudnote.entity;

import java.io.Serializable;
/**
 * 规则：
 *   类型对应，名称一致，实现序列化
 *   类型建议采用封装类型（如Double,Integer...）
 */
public class User implements Serializable{
	private String cn_user_id;
	private String cn_user_name;
	private String cn_user_password;
	private String cn_user_token;
	private String cn_user_nick;
	public String getCn_user_id() {
		return cn_user_id;
	}
	public void setCn_user_id(String cnUserId) {
		cn_user_id = cnUserId;
	}
	public String getCn_user_name() {
		return cn_user_name;
	}
	public void setCn_user_name(String cnUserName) {
		cn_user_name = cnUserName;
	}
	public String getCn_user_password() {
		return cn_user_password;
	}
	public void setCn_user_password(String cnUserPassword) {
		cn_user_password = cnUserPassword;
	}
	public String getCn_user_token() {
		return cn_user_token;
	}
	public void setCn_user_token(String cnUserToken) {
		cn_user_token = cnUserToken;
	}
	public String getCn_user_nick() {
		return cn_user_nick;
	}
	public void setCn_user_nick(String cnUserNick) {
		cn_user_nick = cnUserNick;
	}
	public User() {
		System.out.println("User的无参构造方法...");
	}
	public User(String cnUserId, String cnUserName, String cnUserPassword,
			String cnUserToken, String cnUserNick) {
		System.out.println("User的有参构造方法...");
		cn_user_id = cnUserId;
		cn_user_name = cnUserName;
		cn_user_password = cnUserPassword;
		cn_user_token = cnUserToken;
		cn_user_nick = cnUserNick;
	}
	@Override
	public String toString() {
		return "User [cn_user_id=" + cn_user_id + ", cn_user_name="
				+ cn_user_name + ", cn_user_nick=" + cn_user_nick
				+ ", cn_user_password=" + cn_user_password + ", cn_user_token="
				+ cn_user_token + "]";
	}
}
