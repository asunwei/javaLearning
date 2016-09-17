package cn.tedu.entity;

import java.sql.Timestamp;

/**
 *  µÃÂ¿‡
 * 
 */
public class Admin {
	private Integer aminId;
	private String adminCode;
	private String password;
	private String name;
	private String telephone;
	private String email;
	private Timestamp enrolldate;
	@Override
	public String toString() {
		return "Admin [adminCode=" + adminCode + ", aminId=" + aminId
				+ ", email=" + email + ", enrolldate=" + enrolldate + ", name="
				+ name + ", password=" + password + ", telephone=" + telephone
				+ "]";
	}
	public Integer getAminId() {
		return aminId;
	}
	public void setAminId(Integer aminId) {
		this.aminId = aminId;
	}
	public String getAdminCode() {
		return adminCode;
	}
	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getEnrolldate() {
		return enrolldate;
	}
	public void setEnrolldate(Timestamp enrolldate) {
		this.enrolldate = enrolldate;
	}
	
}
