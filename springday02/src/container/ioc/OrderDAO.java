package container.ioc;

import java.io.Serializable;
/**
 * DAO实现
 * @author Administrator
 *
 */
public class OrderDAO implements Serializable,IOrderDAO {
	public OrderDAO(){
		System.out.println("OrderDAO构造器...");
	}
	public void delete(int id){
		System.out.println("采用OrderDAO技术删除订单...");
	}
	
}
