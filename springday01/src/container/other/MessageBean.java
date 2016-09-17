package container.other;

import java.io.Serializable;

public class MessageBean implements Serializable {
	public MessageBean(){
		System.out.println("MessageBean的构造器...");
	}
	/*
	 * 定义方法
	 */
	public void init(){
		System.out.println("MessageBean的init方法...");
	}
	public void sendMessage(){
		System.out.println("MessageBean的sendMessage方法...");
	}
	public void destroy(){
		System.out.println("MessageBean的destroy方法...");
	}
}
