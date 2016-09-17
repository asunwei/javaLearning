package container.autowire;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("bar")
public class Bar implements Serializable{
	private Waiter wt;
	public Bar(){
		System.out.println("Bar�޲ι�����...");
	}
	@Autowired
	public Bar(@Qualifier("wt")Waiter wt) {
		System.out.println("Bar�вι�����...");
		this.wt = wt;
	}

	@Override
	public String toString() {
		return "Bar [wt=" + wt + "]";
	}
	
}
