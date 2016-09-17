package entity;

import java.io.Serializable;

public class User implements Serializable{
	//userName对象的属性
	private String userName;
	private String password;
	private String sex;
	private String[] loves;
	private Course course;
	
	//name是Bean的属性
	//EL访问的是bean的属性
	public String getName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getLoves() {
		return loves;
	}
	public void setLoves(String[] loves) {
		this.loves = loves;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
