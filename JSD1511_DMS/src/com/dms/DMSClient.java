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
 * DMS�ͻ��ˣ���Ҫ�����Ǹ����Ѽ�unixϵͳ�е��û�
 * ��������Ϣ
 * ͨ��������ɣ�
 * 1������unixϵͳ��־�ļ�
 * 2�������������־�ļ����
 * 3���������־�����������
 * @author Administrator
 *
 */
public class DMSClient {
	/*
	 * ��һ����������־��Ҫ������
	 */
	//unixϵͳ��־�ļ�
	private File logFile;
	//������������־�ļ�
	private File textLogFile;
	//��ǩ�ļ�
	private File lastPositionFile;
	//ÿ�ν�����־����Ŀ��
	private int batch;
	/*
	 * �ڶ����������־��Ҫ������
	 */
	//��������ļ�
	private File logRecFile;
	//����δ��Եĵ�¼��־�ļ�
	private File loginLogFile;
	
	/*
	 * ��������������־��Ҫ������
	 */
	//����˵�ַ
	private String serverHost;
	//����˶˿�
	private int serverPort;

	/*
	 * ���췽����������ʼ�� 
	 */
	public DMSClient() throws Exception{
		try {
			//1.����XML����������Ϣ
			Map<String,String> config=loadConfig();
			//2.����������Ϣ��ʼ���ͻ���
			init(config);
		} catch (Exception e) {
			System.out.println("��ʼ�ͻ���ʧ�ܣ�");
			throw e;
		}
	}
	/*
	 * ���췽����ʹ�ã��ø�����������Ϣ��ʼ���ͻ�������
	 */
	private void init(Map<String,String> config) throws Exception{
		try {
			/*
			 * ��ʼ����һ����Ҫ������
			 */
			logFile=new File(config.get("logfile"));
			textLogFile=new File(config.get("textlogfile"));
			lastPositionFile=new File(config.get("lastpositionfile"));
			batch=Integer.parseInt(config.get("batch"));
			
			/*
			 * ��ʼ���ڶ�����Ҫ������
			 */
			logRecFile=new File(config.get("logrecfile"));
			loginLogFile=new File(config.get("loginlogfile"));
			/*
			 * ��ʼ����������Ҫ����
			 */
			serverHost=config.get("serverhost");
			serverPort=Integer.parseInt(config.get("serverport"));//....................
			
		} catch (Exception e) {
			System.out.println("��ʼ������ʧ�ܣ�");
			throw e;
		}
	}
	
	/*
	 *���췽����ʹ�ã���������config.xml�ļ���
	 *������Ϣ
	 *����Map�б������config.xml�ļ��е�����
	 *���ݣ�����keyΪ��ǩ����valueΪ�м��Ӧ���ı�
	 */
	private Map<String,String> loadConfig() throws Exception{
		try {
			Map<String,String> config=new HashMap<String,String>();
			
			SAXReader reader=new SAXReader();
			Document document =reader.read(new File("config.xml"));
			Element root=document.getRootElement();
			
			//��ȡconfig��ǩ�µ������ӱ�ǩ
			List<Element> elements=root.elements();
			for(Element e:elements){
				//��ǩ��������Ϊkey
				String key=e.getName();
				//��ȡ��ǩ�ı���Ϊvalue
				String value=e.getTextTrim();
				config.put(key, value);
			}
			//��׮
//			System.out.println(config);
			return config;
			
		} catch (Exception e) {
			System.out.println("���������ļ�ʧ��");
			throw e;
		}
	}
		
	/*
	 * ����˿�ʼ�����ķ���
	 */
	public void start(){
		/*
		 * �ͻ���������ѭ��3��
		 * 1��������־
		 * 2�������־
		 * 3��������־
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
	 * ��������������־
	 */
	public boolean sendLogs(){
		Socket socket=null;
		try {
			/*
			 * ��ȡ�ڶ������ɵ�logRecFile�ļ�
			 * ����������Ե���־�õ���Ȼ��������
			 * ����ˣ��������������־����
			 * 
			 * ���裺
			 * 1����Ҫ���ж�
			 *   �ж�logRecFile�ļ��Ƿ����
			 * 2����ȡLogRecFile�ļ��������е����
			 *    ��־��ȡ���������뵽һ�������еȴ�
			 *    ����
			 * 3������Socket�����ӷ����
			 * 4:��ȡ�������Ȼ�����������־ȫ��
			 *   ���ͳ�ȥ
			 * 5����󵥶������˷���һ���ַ�����OVER��
			 *    ��ʾ������־�ѷ���
			 * 6����ȡ����������ȡ����˷��ͻ�������Ӧ��
			 *    ����ȡ���ǡ�OK�������ʾ�������ȷ����
			 *    ���������ļ������ڶ������ɵ�����ļ�ɾ��
			 * 
			 */
			//1
			if(!logRecFile.exists()){
				System.out.println(logRecFile+"�����ڣ�");
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
	 * �ڶ����������־
	 * @return
	 */
	private boolean matchLogs(){
		try {
			/*
			 * �����־������һ�����ɵ���־�ļ�
			 * �еĴ������־��ȡ�������Լ��ϴ�
			 * �����Ϻ�δ��Գɹ�����־��ȡ����
			 * Ȼ����Щ��־���գ�
			 * user,pid,host��ͬ��Ȼ��type
			 * һ����7��һ����8������ԣ��������е�
			 * �����־����logRecFile.��������δ���
			 * ��־���뵽loginLogFile.
			 * 
			 * 
			 * ���裺
			 * 1����Ҫ���жϣ�
			 *  1.1:textLogFileҪ����
			 *  1.2��logRecFile�ļ������ڣ�����
			 *      ����Թ���
			 * 2����ȡtextLogFile�ļ�����������־��ȡ
			 *    ���������뵽һ��list������
			 * 3���ж�loginLogFile�Ƿ���ڣ�������Ҳ��
			 *    ���ļ��б�����ϴ�δ��Ե���־Ҳ��ȡ����
			 *    ���뵽List������
			 * 4������һ�����ϣ����ڱ������������־
			 *    ����һ��Map�����ڱ������е�����־
			 *    ����һ��Map�����ڱ������еǳ���־
			 *    ��������Ե���־���յ���ǳ��ֱ�ŵ�����
			 *    Map�У�����key�ĸ�ʽ��user,pid,host
			 *    value�ĸ�ʽ�����ǵ�ǰ��־����LogData
			 *    
			 *    �����ǳ�Map�����ݵ�����־��Ӧ��keyȥ���롣������������������
			 *    Map���ҵ���Ӧ����־�Թ��������־��������
			 *    ���������־�ļ����У�����������־�ӵ���Map
			 *    ��ɾ����
			 * 5����������Ե���־����д�뵽logRecFile��
			 * 6��������δ�����־����д�뵽loginLogFile��
			 *    
			 */
			//1
			//1.1
			if(!textLogFile.exists()){
				System.out.println(textLogFile+"������");
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
			//��׮
//			for(LogData log:logs){
//				System.out.println(log);
//			}
			//4
			List<LogRec> matches=new ArrayList<LogRec>();
			Map<String,LogData> loginMap=new HashMap<String,LogData>();
			Map<String,LogData> logoutMap=new HashMap<String,LogData>();
			
			//����
			for(LogData log:logs){
				String key=log.getUser()+","+log.getPid()+","+log.getHost();
				//�Ƿ������־
				if(log.getTyre()==LogData.LONIN_TYPE){
					loginMap.put(key, log);
				}
				if(log.getTyre()==LogData.LOGOUT_TYPY){
					logoutMap.put(key, log);
				}
			}
			//��׮
//			System.out.println("���Ե��룺"+loginMap);
//			System.out.println("���Եǳ���"+logoutMap);
			//���ݵǳ��ҵ�¼
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
			
			//����һ���������ļ�ɾ��
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
			 * ������־��һ���Զ�ȡbatch����־
			 * ��ת���ɿɶ����ַ�����ʽ��д�뵽textLogFile
			 * �ļ��У�
			 * ���裺
			 * 1����Ҫ���ж�
			 *  1.1:��textLogFile�ļ��Ѵ��ڣ����ظ�
			 *      ִ�е�һ������Ϊ��һ���ɹ�ִ�к����
			 *      �ɸ��ļ�������¼��������־�����ڶ���
			 *      ��Գɹ����ɾ�����ļ������������ļ�
			 *      ����ֻ�����������Ҫô��һ���Ѿ�ִ��
			 *      ��ϣ�Ҫô�ڶ���ûִ�гɹ�
			 *  1.2:wtmpx�ļ�Ҫ����
			 *  1.3�������ǩ�ļ��м�¼������ȡλ��
			 *       �Լ�wtmpx�ļ����ܴ�С���ж��Ƿ�����
			 *       ����һ����־���Խ���������������ȡ��
			 *       λ�÷��أ��Ա�����￪ʼ��������־
			 * 
			 * 2:����RandomAccessFile������ȡ
			 *   ϵͳ��־�ļ�logFile(wtmpx)
			 * 3:�����ϴζ�ȡ��λ��ָ���ƶ�������Ա�����µ�
			 *   ��������
			 * 4������һ�����ϣ����ڱ������н���������
			 *    ��־��Ȼ��ѭ��batch�Σ�ÿ�ζ�ȡһ��
			 *    372�ֽڣ��������н�����Ҫ��5��������
			 *    ��user,pid,type,time,host
			 *    ����ÿһ����־����һ��LogData����Ȼ��
			 *    ���뼯��
			 * 5����������ÿһ��LOGData�����toString�����ַ���
			 *    ����Ϊ��λд��textLogFile
			 * 6����RandomAccessFile��ǰָ��λ�ñ��浽��ǩ�ļ�
			 */
			//1.1
			if(textLogFile.exists()){
				return true;
			}
			
			//1.2
			if(!logFile.exists()){
				System.out.println(logFile+"�����ڣ�");
				return false;
			}
			//1.3
			long lastPosition=hasLogs();
			if(lastPosition<0){
				System.out.println("û����־���Խ����ˣ�");
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
				//ÿ����һ����־ǰ��Ӧ�ж��Ƿ��пɽ�����־
				if(logFile.length()-lastPosition<LogData.LOG_LENGTH){
					break;
				}
				//����user
				raf.seek(lastPosition+LogData.USER_OFFSET);
				String user=IOUtil.readString(raf, LogData.USER_LENGTH).trim();
				//����pid
				raf.seek(lastPosition+LogData.PID_OFFSET);
				int pid=raf.readInt();
				//����type
				raf.seek(lastPosition+LogData.TYPE_OFFSET);
				short type=raf.readShort();
				//����time
				raf.seek(lastPosition+LogData.TIME_OFFSET);
				int time=raf.readInt();
				//����host
				raf.seek(lastPosition+LogData.HOST_OFFSET);
				String host=IOUtil.readString(raf, LogData.HOST_LENGTH).trim();
				
				LogData log=new LogData(user,pid,type,time,host);
				list.add(log);
				lastPosition=raf.getFilePointer();
			}
			//��׮
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
		 * ������ǩ�ļ���¼λ�ã��ж�ϵͳ��־�ļ�
		 * �Ƿ�����־�����жϣ����У����ϴ����
		 * ��λ�÷��أ���û�У��򷵻�-1��
		 */
	private long hasLogs(){
		/*
		 * ��ǩ�ļ��������ڣ�˵����һ�ζ�ȡ
		 */
		if(!lastPositionFile.exists()){
			return 0;
		}
		/*
		 * �����ڣ����ȡ����λ�ã��Ա��ж��Ƿ�
		 * ������־���Խ���
		 */
		try {
			long lastPosition=IOUtil.readLine(lastPositionFile);
			/*
			 * �ж��Ƿ�����־���Խ���
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
