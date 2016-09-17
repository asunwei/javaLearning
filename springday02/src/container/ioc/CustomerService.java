package container.ioc;

import java.io.Serializable;
/**
 * 依赖注入：
 *       尽量使用接口类型
 * @author Administrator
 *
 */

public class CustomerService implements Serializable{
	private IOrderDAO dao;
	public CustomerService(){
		System.out.println("Customer构造器...");
	}
	
	public IOrderDAO getDao() {
		return dao;
	}
	public void setDao(IOrderDAO dao) {
		System.out.println("调用setDao方法注入dao...");
		this.dao = dao;
	}

	public void cancelOrder(int id){
		System.out.println("取消订单...");
		dao.delete(id);
	}
}