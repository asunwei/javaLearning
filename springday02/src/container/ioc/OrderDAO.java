package container.ioc;

import java.io.Serializable;
/**
 * DAOʵ��
 * @author Administrator
 *
 */
public class OrderDAO implements Serializable,IOrderDAO {
	public OrderDAO(){
		System.out.println("OrderDAO������...");
	}
	public void delete(int id){
		System.out.println("����OrderDAO����ɾ������...");
	}
	
}
