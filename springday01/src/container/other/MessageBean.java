package container.other;

import java.io.Serializable;

public class MessageBean implements Serializable {
	public MessageBean(){
		System.out.println("MessageBean�Ĺ�����...");
	}
	/*
	 * ���巽��
	 */
	public void init(){
		System.out.println("MessageBean��init����...");
	}
	public void sendMessage(){
		System.out.println("MessageBean��sendMessage����...");
	}
	public void destroy(){
		System.out.println("MessageBean��destroy����...");
	}
}
