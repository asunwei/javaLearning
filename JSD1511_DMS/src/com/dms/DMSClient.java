package com.dms;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.dms.bo.LogData;
import com.dms.bo.LogRec;

/**
 * DMS客户端，主要工作是负责搜集unix系统中的用户
 * 上下线信息
 * 通过三步完成：
 * 1：解析unix系统日志文件
 * 2：将解析后的日志文件配对
 * 3：将配对日志发送至服务端
 * @author Administrator
 *
 */
public class DMSClient {
	/*
	 * 第一步：解析日志需要的属性
	 */
	//unix系统日志文件
	private File logFile;
	//保存解析后的日志文件
	private File textLogFile;
	//书签文件
	private File lastPositionFile;
	//每次解析日志的条目数
	private int batch;
	/*
	 * 第二步：配对日志需要的属性
	 */
	//保存配对文件
	private File logRecFile;
	//保存未配对的登录日志文件
	private File loginLogFile;
	
	/*
	 * 第三步：发送日志需要的属性
	 */
	//服务端地址
	private String serverHost;
	//服务端端口
	private int serverPort;

	/*
	 * 构造方法：用来初始化 
	 */
	public DMSClient() throws Exception{
		try {
			//1.解析XML加载配置信息
			Map<String,String> config=loadConfig();
			//2.根据配置信息初始化客户端
			init(config);
		} catch (Exception e) {
			System.out.println("初始客户端失败！");
			throw e;
		}
	}
	/*
	 * 构造方法中使用，用给定的配置信息初始化客户端属性
	 */
	private void init(Map<String,String> config) throws Exception{
		try {
			/*
			 * 初始化第一步需要的属性
			 */
			logFile=new File(config.get("logfile"));
			textLogFile=new File(config.get("textlogfile"));
			lastPositionFile=new File(config.get("lastpositionfile"));
			batch=Integer.parseInt(config.get("batch"));
			
			/*
			 * 初始化第二步需要的属性
			 */
			logRecFile=new File(config.get("logrecfile"));
			loginLogFile=new File(config.get("loginlogfile"));
			/*
			 * 初始化第三步需要属性
			 */
			serverHost=config.get("serverhost");
			serverPort=Integer.parseInt(config.get("serverport"));//....................
			
		} catch (Exception e) {
			System.out.println("初始化属性失败！");
			throw e;
		}
	}
	
	/*
	 *构造方法中使用，用来加载config.xml文件中
	 *配置信息
	 *返回Map中保存的了config.xml文件中的配置
	 *内容，其中key为标签名，value为中间对应的文本
	 */
	private Map<String,String> loadConfig() throws Exception{
		try {
			Map<String,String> config=new HashMap<String,String>();
			
			SAXReader reader=new SAXReader();
			Document document =reader.read(new File("config.xml"));
			Element root=document.getRootElement();
			
			//获取config标签下的所有子标签
			List<Element> elements=root.elements();
			for(Element e:elements){
				//标签的名字作为key
				String key=e.getName();
				//获取标签文本作为value
				String value=e.getTextTrim();
				config.put(key, value);
			}
			//打桩
//			System.out.println(config);
			return config;
			
		} catch (Exception e) {
			System.out.println("加载配置文件失败");
			throw e;
		}
	}
		
	/*
	 * 服务端开始工作的方法
	 */
	public void start(){
		/*
		 * 客户端周期性循环3步
		 * 1：解析日志
		 * 2：配对日志
		 * 3：发送日志
		 * 
		 */
		while(true){
			if(!parseLogs()){
				continue;
			}
			if(!matchLogs()){
				continue;
			}
			sendLogs();
		}
	}
	/**
	 * 第三步：发送日志
	 */
	public boolean sendLogs(){
		Socket socket=null;
		try {
			/*
			 * 读取第二步生成的logRecFile文件
			 * 并将所有配对的日志得到，然后连接上
			 * 服务端，并将所以配对日志发送
			 * 
			 * 步骤：
			 * 1：必要的判断
			 *   判断logRecFile文件是否存在
			 * 2：读取LogRecFile文件，将所有的配对
			 *    日志读取出来并存入到一个集合中等待
			 *    发送
			 * 3：创建Socket并连接服务端
			 * 4:获取输出流，然后将所有配对日志全部
			 *   发送出去
			 * 5：最后单独向服务端发送一个字符串“OVER”
			 *    表示所以日志已发送
			 * 6：获取输入流，读取服务端发送回来的相应，
			 *    若读取到是“OK”，则表示服务端正确接收
			 *    所有配置文件，将第二步生成的配对文件删除
			 * 
			 */
			//1
			if(!logRecFile.exists()){
				System.out.println(logRecFile+"不存在！");
				return false;
			}
			//2
			List<String> matches=IOUtil.loadRecFile(logRecFile);
			
			//3
			socket=new Socket(serverHost,serverPort);
			
			//4
			PrintWriter pw=new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
			
			for(String log:matches){
				pw.println(log);
			}
			//5
			pw.println("over");
			pw.flush();
			
			//6
			BufferedReader br=new BufferedReader(
					new InputStreamReader(socket.getInputStream(),"UTF-8"));
			
			String response=br.readLine();
			if("OK".equals(response)){
				logRecFile.delete();
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(socket!=null){
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	/**
	 * 第二步：配对日志
	 * @return
	 */
	private boolean matchLogs(){
		try {
			/*
			 * 配对日志，将第一步生成的日志文件
			 * 中的待配对日志读取出来，以及上次
			 * 配对完毕后未配对成功的日志读取出来
			 * 然后将这些日志按照：
			 * user,pid,host相同，然后type
			 * 一个是7，一个是8进行配对，并将所有的
			 * 配对日志存入logRecFile.并将所有未配对
			 * 日志存入到loginLogFile.
			 * 
			 * 
			 * 步骤：
			 * 1：必要的判断：
			 *  1.1:textLogFile要存在
			 *  1.2：logRecFile文件若存在，则不重
			 *      复配对工作
			 * 2：读取textLogFile文件，将所有日志读取
			 *    出来并存入到一个list集合中
			 * 3：判断loginLogFile是否存在，若存在也将
			 *    该文件中保存的上次未配对的日志也读取出来
			 *    存入到List集合中
			 * 4：创建一个集合，用于保存所有配对日志
			 *    创建一个Map，用于保存所有登入日志
			 *    创建一个Map，用于保存所有登出日志
			 *    将所有配对的日志按照登入登出分别放到两个
			 *    Map中，其中key的格式：user,pid,host
			 *    value的格式：就是当前日志对象LogData
			 *    
			 *    遍历登出Map，根据登入日志对应的key去登入。。。。。。。。。。
			 *    Map中找到对应的日志以构成配对日志，并存入
			 *    保存配对日志的集合中，并将登入日志从登入Map
			 *    中删除掉
			 * 5：将所有配对的日志按行写入到logRecFile中
			 * 6：将所有未配对日志按行写入到loginLogFile中
			 *    
			 */
			//1
			//1.1
			if(!textLogFile.exists()){
				System.out.println(textLogFile+"不存在");
				return false;
			}
			//1.2
			if(logRecFile.exists()){
				return true;
			}
			//2
			List<LogData> logs=IOUtil.loadLogData(textLogFile);
			
			//3
			if(loginLogFile.exists()){
				logs.addAll(IOUtil.loadLogData(loginLogFile));
			}
			//打桩
//			for(LogData log:logs){
//				System.out.println(log);
//			}
			//4
			List<LogRec> matches=new ArrayList<LogRec>();
			Map<String,LogData> loginMap=new HashMap<String,LogData>();
			Map<String,LogData> logoutMap=new HashMap<String,LogData>();
			
			//分类
			for(LogData log:logs){
				String key=log.getUser()+","+log.getPid()+","+log.getHost();
				//是否登入日志
				if(log.getTyre()==LogData.LONIN_TYPE){
					loginMap.put(key, log);
				}
				if(log.getTyre()==LogData.LOGOUT_TYPY){
					logoutMap.put(key, log);
				}
			}
			//打桩
//			System.out.println("所以登入："+loginMap);
//			System.out.println("所以登出："+logoutMap);
			//根据登出找登录
			for(Entry<String,LogData> e:logoutMap.entrySet()){
				LogData logout=e.getValue();
				LogData login=loginMap.remove(e.getKey());
				LogRec logRec=new LogRec(login,logout);
				matches.add(logRec);
			}
			//5
			IOUtil.saveCollection(matches, logRecFile);
			
			//6
			IOUtil.saveCollection(loginMap.values(), loginLogFile);
			
			//将第一步生产的文件删除
			textLogFile.delete();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	private boolean parseLogs(){
		RandomAccessFile raf=null;
		try {
			/*
			 * 解析日志，一次性读取batch条日志
			 * 并转换成可读的字符串形式，写入到textLogFile
			 * 文件中，
			 * 步骤：
			 * 1：必要的判断
			 *  1.1:若textLogFile文件已存在，则不重复
			 *      执行第一步。因为第一步成功执行后会生
			 *      成该文件，并记录解析的日志，当第二步
			 *      配对成功后会删除该文件，所以若该文件
			 *      存在只有两种情况，要么第一步已经执行
			 *      完毕，要么第二步没执行成功
			 *  1.2:wtmpx文件要存在
			 *  1.3：结合书签文件中记录的最后读取位置
			 *       以及wtmpx文件的总大小，判断是否至少
			 *       还有一条日志可以解析，若有则将最后读取的
			 *       位置返回，以便从这里开始解析新日志
			 * 
			 * 2:创建RandomAccessFile用来读取
			 *   系统日志文件logFile(wtmpx)
			 * 3:根据上次读取的位置指针移动到那里，以便进行新的
			 *   解析工作
			 * 4：创建一个集合，用于保存所有解析出来的
			 *    日志，然后循环batch次，每次读取一个
			 *    372字节，并在其中解析需要的5部分数据
			 *    ：user,pid,type,time,host
			 *    并将每一条日志存入一个LogData对象，然后
			 *    放入集合
			 * 5：将集合中每一个LOGData对象的toString返回字符串
			 *    以行为单位写入textLogFile
			 * 6：将RandomAccessFile当前指针位置保存到书签文件
			 */
			//1.1
			if(textLogFile.exists()){
				return true;
			}
			
			//1.2
			if(!logFile.exists()){
				System.out.println(logFile+"不存在！");
				return false;
			}
			//1.3
			long lastPosition=hasLogs();
			if(lastPosition<0){
				System.out.println("没有日志可以解析了！");
				return false;
			}
//			System.out.println("pos:"+lastPosition);
			
			//2
			raf=new RandomAccessFile(logFile,"r");
			
			//3
			raf.seek(lastPosition);
			
			//4
			List<LogData> list=new ArrayList<LogData>();
			for(int i=0;i<batch;i++){
				//每解析一条日志前都应判断是否还有可解析日志
				if(logFile.length()-lastPosition<LogData.LOG_LENGTH){
					break;
				}
				//解析user
				raf.seek(lastPosition+LogData.USER_OFFSET);
				String user=IOUtil.readString(raf, LogData.USER_LENGTH).trim();
				//解析pid
				raf.seek(lastPosition+LogData.PID_OFFSET);
				int pid=raf.readInt();
				//解析type
				raf.seek(lastPosition+LogData.TYPE_OFFSET);
				short type=raf.readShort();
				//解析time
				raf.seek(lastPosition+LogData.TIME_OFFSET);
				int time=raf.readInt();
				//解析host
				raf.seek(lastPosition+LogData.HOST_OFFSET);
				String host=IOUtil.readString(raf, LogData.HOST_LENGTH).trim();
				
				LogData log=new LogData(user,pid,type,time,host);
				list.add(log);
				lastPosition=raf.getFilePointer();
			}
			//打桩
//			for(LogData log:list){
//				System.out.println(log);
//			}
			//5
			IOUtil.saveCollection(list, textLogFile);
			
			//6
			IOUtil.saveLong(lastPosition, lastPositionFile);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(raf !=null){
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
		
		/*
		 * 根据书签文件记录位置，判断系统日志文件
		 * 是否还有日志可以判断，若有，则将上次最后
		 * 的位置返回，若没有，则返回-1。
		 */
	private long hasLogs(){
		/*
		 * 书签文件若不存在，说明第一次读取
		 */
		if(!lastPositionFile.exists()){
			return 0;
		}
		/*
		 * 若存在，则读取最后的位置，以便判断是否
		 * 还有日志可以解析
		 */
		try {
			long lastPosition=IOUtil.readLine(lastPositionFile);
			/*
			 * 判断是否还有日志可以解析
			 */
			if(logFile.length()-lastPosition>=LogData.LOG_LENGTH){
				return lastPosition;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		try {
			DMSClient client=new DMSClient();
			client.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
