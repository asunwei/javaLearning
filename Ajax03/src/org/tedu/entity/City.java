package org.tedu.entity;

import java.io.Serializable;

public class City implements Serializable{
	private int id;
	private String name;
	public City() {
		System.out.println("City���޲ι�����...");
	}
	public City(int id, String name) {
		System.out.println("City�вι�����...");
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