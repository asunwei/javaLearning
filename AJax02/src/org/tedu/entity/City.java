package org.tedu.entity;

public class City {
	private int id;
	private String name;
	public City(){
		System.out.println("�޲ι��췽��...");
	}
	public City(int id, String name) {
		System.out.println("�вι��췽��...");
		this.id = id;
		this.name = name;
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
	
}
