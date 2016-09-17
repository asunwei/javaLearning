package web;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * ServletRequestListener用来监听request
 * 创建和销毁事件
 * @author Administrator
 * @author Administrator
 *
 */
public class MeListener implements ServletRequestListener ,HttpSessionAttributeListener{
	public MeListener(){
		System.out.println("创建Listener");
	}
//监听Request销毁事件
	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println("request被销毁");
	}
//监听Request初始化事件
	public void requestInitialized(ServletRequestEvent e) {
		System.out.println("request初始化");
		System.out.println(e.getServletRequest());
	}
//监听数据添加事件
	public void attributeAdded(HttpSessionBindingEvent e) {
		System.out.println("向session中添加数据");
		System.out.println(e.getSession());
	}
//监听数据移除事件
	public void attributeRemoved(HttpSessionBindingEvent e) {
	}
//监听数据替换事件
	public void attributeReplaced(HttpSessionBindingEvent e) {
	}
}
