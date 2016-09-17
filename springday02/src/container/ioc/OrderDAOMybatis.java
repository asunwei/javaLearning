package container.ioc;

import java.io.Serializable;
/**
 * DAO实现
 * @author Administrator
 *
 */
public class OrderDAOMybatis implements Serializable,IOrderDAO{
	public OrderDAOMybatis(){
		System.out.println("OrderDAOMybatis构造器...");
	}
	public void delete(int id){
		System.out.println("采用Mybatis技术删除订单...");
	}
}
