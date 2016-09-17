package com.dms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.dms.bo.LogData;

/*
 * ������һ�������࣬����ͻ������еĶ�д����
 */
public class IOUtil {
	/**
	 * �Ӹ������ļ��ж�ȡÿһ����־��Ϣ�������뼯�Ϻ󷵻ظü���
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static List<String> loadRecFile(File file) throws Exception{
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			List<String> list=new ArrayList<String>();
			String line=null;
			while((line=br.readLine())!=null){
				list.add(line);
			}
				return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			if(br!=null){
				br.close();
			}
		}
	}
	
	
	
	
	/**
	 * �Ӹ������ļ��ж�ȡÿһ����־������ת��
	 * Ϊ���ɸ�LogDataʵ�����뼯�ϣ����ս���
	 * ���Ϸ���
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static List<LogData> loadLogData(File file) throws Exception{
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			List<LogData> list=new ArrayList<LogData>();
			String line=null;
			while((line=br.readLine())!=null){
				LogData log=new LogData(line);
				list.add(log);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			if(br!=null){
				br.close();
			}
		}
		
	}
	
	
	
	
	/**
	 * ��������Longֵ���ַ�������ʽд�뵽
	 * �����ļ��ĵ�һ���С�
	 * @param l
	 * @param file
	 * @throws Exception
	 */
	public static void saveLong(Long l,File file ) throws Exception{
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(file);
			pw.println(l);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	
	/**
	 * �������ļ����е�ÿ��Ԫ�ص�toString���ص��ַ���
	 * ���е�λд�뵽ָ���ļ��С�
	 * @param c
	 * @param file
	 * @throws Exception
	 */
	
	public static void saveCollection(Collection c,File file) throws Exception{
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(file);
			for(Object o:c){
				pw.println(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	/**
	 * �Ӹ�����RandomAccessFile��ǰλ��������ȡָ�����ȵ��ֽ���
	 * ��ת��Ϊ�ַ����󷵻�
	 * @param raf
	 * @param len
	 * @return
	 * @throws Exception
	 */
	
	public static String readString(RandomAccessFile raf,int len) throws Exception{
		try {
			byte[] buf=new byte[len];
			raf.read(buf);
			String str=new String(buf,"ISO8859-1");
			return str;
			
		} catch (Exception e) {
			throw e;
		}
	}
	/*
	 * ��ָ�����ļ��ж�ȡ��һ���ַ�����������ת��Ϊlongֵ����
	 */
	public static long readLine(File file) throws Exception{
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line=br.readLine();
			return Long.parseLong(line);
		} catch (Exception e) {
			throw e;
		}finally{
			if(br!=null){
				br.close();
			}
		}
	}
}
