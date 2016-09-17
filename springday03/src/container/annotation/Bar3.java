package container.annotation;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("bar3")
public class Bar3 implements Serializable{
	//@Resource(name="wt")
	private Waiter waiter;
	public Bar3(){
		System.out.println("Bar3构造器...");
	}
	public final Waiter getWaiter() {
		return waiter;
	}
	@Resource(name="wt")
	//name指定要注入的bean的id
	public final void setWaiter(Waiter waiter) {
		System.out.println("调用setWaiter方法注入waiter...");
		this.waiter = waiter;
	}
	@Override
	public String toString() {
		return "Bar3 [waiter=" + waiter + "]";
	}
	
}
