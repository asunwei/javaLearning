package container.ioc;

import java.io.Serializable;
/**
 * DAOʵ��
 * @author Administrator
 *
 */
public class OrderDAOMybatis implements Serializable,IOrderDAO{
	public OrderDAOMybatis(){
		System.out.println("OrderDAOMybatis������...");
	}
	public void delete(int id){
		System.out.println("����Mybatis����ɾ������...");
	}
}
