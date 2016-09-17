package container.ioc;

import java.io.Serializable;
/**
 * ����ע�룺
 *       ����ʹ�ýӿ�����
 * @author Administrator
 *
 */

public class CustomerService implements Serializable{
	private IOrderDAO dao;
	public CustomerService(){
		System.out.println("Customer������...");
	}
	
	public IOrderDAO getDao() {
		return dao;
	}
	public void setDao(IOrderDAO dao) {
		System.out.println("����setDao����ע��dao...");
		this.dao = dao;
	}

	public void cancelOrder(int id){
		System.out.println("ȡ������...");
		dao.delete(id);
	}
}