package entity;

import java.io.Serializable;

public class Course implements Serializable{
	private String name;
	private int days;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
}
