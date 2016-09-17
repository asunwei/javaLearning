package container.annotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 用set方式注入
 * @author Administrator
 *
 */
@Component("bar2")
public class Bar2 implements Serializable{
	@Autowired
	@Qualifier("wt")
	private Waiter waiter;

	public Bar2() {
		System.out.println("Bar2构造器...");
	}

	public Waiter getWaiter() {
		return waiter;
	}
//	@Autowired
//	public void setWaiter(@Qualifier("wt")Waiter waiter) {
//		System.out.println("调用setWaiter方法注入waiter...");
//		this.waiter = waiter;
//	}

	@Override
	public String toString() {
		return "Bar2 [waiter=" + waiter + "]";
	}
	
}
