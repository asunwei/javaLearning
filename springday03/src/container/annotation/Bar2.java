package container.annotation;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * ��set��ʽע��
 * @author Administrator
 *
 */
@Component("bar2")
public class Bar2 implements Serializable{
	@Autowired
	@Qualifier("wt")
	private Waiter waiter;

	public Bar2() {
		System.out.println("Bar2������...");
	}

	public Waiter getWaiter() {
		return waiter;
	}
//	@Autowired
//	public void setWaiter(@Qualifier("wt")Waiter waiter) {
//		System.out.println("����setWaiter����ע��waiter...");
//		this.waiter = waiter;
//	}

	@Override
	public String toString() {
		return "Bar2 [waiter=" + waiter + "]";
	}
	
}
