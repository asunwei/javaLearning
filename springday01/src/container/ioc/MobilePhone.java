package container.ioc;

import java.io.Serializable;

public class MobilePhone implements Serializable{
	private String brand;
	private String cpu;
	private String ram;
	public MobilePhone(){
		System.out.println("MobilePhone�Ĺ�����...");
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
		System.out.println("����setBrand����ע��brand...");
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		System.out.println("����setCpu����ע��cpu...");
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		System.out.println("����setRam����ע��ram...");
		this.ram = ram;
	}
	
}
