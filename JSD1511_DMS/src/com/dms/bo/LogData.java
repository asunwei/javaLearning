package com.dms.bo;
/**
 * 该类的每一个实例用于表示unix系统日志
 * 文件中的一条日志信息
 * @author Administrator
 *
 */
public class LogData {
	/*
	 *常量定义 
	 */
	/*
	 * 日志类型:登入日志
	 */
	public static final short LONIN_TYPE=7;
	/*
	 * 日志类型:登入日志
	 */
	public static final short LOGOUT_TYPY=8;
	/*
	 *一条日志长度
	 */
	public static final int LOG_LENGTH=372;
	/*
	 * user在一条日志的起始位置
	 */
	public static final int USER_OFFSET=0;
	/*
	 * user的长度
	 */
	public static final int USER_LENGTH=32;
	/*
	 * pid在一条日志的位置
	 */
	public static final int PID_OFFSET=68;
	/*
	 * type在一条日志的起始位置
	 */
	public static final int TYPE_OFFSET=72;
	/*
	 * time在一条日志的起始位置
	 */
	public static final int TIME_OFFSET=80;
	/*
	 * host在一条日志的起始位置
	 */
	public static final int HOST_OFFSET=114;
	/*
	 * host长度
	 */
	public static final int HOST_LENGTH=258;
	
	/*
	 * 定义属性
	 */
	//用户名
	private String user;
	//进程ID
	private int pid;
	//日志类型
	private short type;
	//日志生成时间
	private int time;
	//登录用户的IP
	private String host;
	public LogData(){
		
	}
	/*
	 * 根据给定的字符串解析为一个LogData实例
	 * 该字符串的格式必须是当前类toString生
	 * 成的格式。
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

