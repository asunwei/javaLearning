package container.annotation;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component("wt")
public class Waiter implements Serializable{
	
	public Waiter(){
		System.out.println("WaiterµÄ¹¹ÔìÆ÷...");
	}

	
}
