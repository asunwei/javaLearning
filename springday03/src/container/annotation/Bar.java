package container.annotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("bar")
public class Bar implements Serializable{
	private Waiter waiter;
	public Bar(){
		System.out.println("Bar�޲���������...");
	}
	@Autowired
	public Bar(@Qualifier("wt")Waiter waiter) {
		System.out.println("Bar�вι�����...");
		this.waiter = waiter;
	}
	@Override
	public String toString() {
		return "Bar [waiter=" + waiter + "]";
	}
	

}
