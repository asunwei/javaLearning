package container.ioc;

import java.io.Serializable;

public class Managee implements Serializable {
	private String name;
	private String dept;
	
	public Managee() {
		System.out.println("Managee�Ĺ�����������");
	}
	public Managee(String name,String dept){
		System.out.println("ʹ�ù�����ע��...");
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", name=" + name + "]";
	}
	
}
