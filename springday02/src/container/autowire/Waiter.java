package container.autowire;

import java.io.Serializable;

public class Waiter implements Serializable {
	private String name;
	public Waiter(){
		System.out.println("Waiter�Ĺ�����...");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("����setName����ע��name...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Waiter [name=" + name + "]";
	}
	
	
}
