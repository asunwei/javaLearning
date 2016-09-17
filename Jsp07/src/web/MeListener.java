package web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * ServletRequestListener��������request
 * �����������¼�
 * @author Administrator
 * @author Administrator
 *
 */
public class MeListener implements ServletRequestListener ,HttpSessionAttributeListener{
	public MeListener(){
		System.out.println("����Listener");
	}
//����Request�����¼�
	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println("request������");
	}
//����Request��ʼ���¼�
	public void requestInitialized(ServletRequestEvent e) {
		System.out.println("request��ʼ��");
		System.out.println(e.getServletRequest());
	}
//������������¼�
	public void attributeAdded(HttpSessionBindingEvent e) {
		System.out.println("��session���������");
		System.out.println(e.getSession());
	}
//���������Ƴ��¼�
	public void attributeRemoved(HttpSessionBindingEvent e) {
	}
//���������滻�¼�
	public void attributeReplaced(HttpSessionBindingEvent e) {
	}
}
