package container.ioc;

import java.io.Serializable;

public class MobilePhone implements Serializable{
	private String brand;
	private String cpu;
	private String ram;
	public MobilePhone(){
		System.out.println("MobilePhone的构造器...");
	}
	
	@Override
	public String toString() {
		return "MobilePhone [brand=" + brand + ", cpu=" + cpu + ", ram=" + ram
				+ "]";
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("调用setBrand方法注入brand...");
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		System.out.println("调用setCpu方法注入cpu...");
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		System.out.println("调用setRam方法注入ram...");
		this.ram = ram;
	}
	
}
