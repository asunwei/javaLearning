package it.servlet;

public class User {
	public String name;
	public String id;
	public String job;
	
	public User() {
	}
	public User(String name, String id, String job) {
		this.name = name;
		this.id = id;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	

}
