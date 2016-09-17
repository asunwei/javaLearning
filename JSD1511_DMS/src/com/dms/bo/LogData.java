package com.dms.bo;
/**
 * �����ÿһ��ʵ�����ڱ�ʾunixϵͳ��־
 * �ļ��е�һ����־��Ϣ
 * @author Administrator
 *
 */
public class LogData {
	/*
	 *�������� 
	 */
	/*
	 * ��־����:������־
	 */
	public static final short LONIN_TYPE=7;
	/*
	 * ��־����:������־
	 */
	public static final short LOGOUT_TYPY=8;
	/*
	 *һ����־����
	 */
	public static final int LOG_LENGTH=372;
	/*
	 * user��һ����־����ʼλ��
	 */
	public static final int USER_OFFSET=0;
	/*
	 * user�ĳ���
	 */
	public static final int USER_LENGTH=32;
	/*
	 * pid��һ����־��λ��
	 */
	public static final int PID_OFFSET=68;
	/*
	 * type��һ����־����ʼλ��
	 */
	public static final int TYPE_OFFSET=72;
	/*
	 * time��һ����־����ʼλ��
	 */
	public static final int TIME_OFFSET=80;
	/*
	 * host��һ����־����ʼλ��
	 */
	public static final int HOST_OFFSET=114;
	/*
	 * host����
	 */
	public static final int HOST_LENGTH=258;
	
	/*
	 * ��������
	 */
	//�û���
	private String user;
	//����ID
	private int pid;
	//��־����
	private short type;
	//��־����ʱ��
	private int time;
	//��¼�û���IP
	private String host;
	public LogData(){
		
	}
	/*
	 * ���ݸ������ַ�������Ϊһ��LogDataʵ��
	 * ���ַ����ĸ�ʽ�����ǵ�ǰ��toString��
	 * �ɵĸ�ʽ��
	 */
	public LogData(String log){
		String[] data=log.split(",");
		this.user=data[0];
		this.pid=Integer.parseInt(data[1]);
		this.type=Short.parseShort(data[2]);
		this.time=Integer.parseInt(data[3]);
		this.host=data[4];
	}
	public LogData(String user, int pid, short tyre, int time, String host) {
		super();
		this.user = user;
		this.pid = pid;
		this.type = tyre;
		this.time = time;
		this.host = host;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public short getTyre() {
		return type;
	}
	public void setTyre(short tyre) {
		this.type = tyre;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String toString(){
		return user+","+pid+","+type+","+time+","+host;
	}
}

