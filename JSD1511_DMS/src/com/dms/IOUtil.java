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
 * 该类是一个工具类，负责客户端所有的读写操作
 */
public class IOUtil {
	/**
	 * 从给定的文件中读取每一行日志信息，并存入集合后返回该集合
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
	 * 从给定的文件中读取每一行日志，并将转换
	 * 为若干个LogData实例存入集合，最终将该
	 * 集合返回
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
	 * 将给定的Long值以字符串的形式写入到
	 * 给定文件的第一行中。
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
	 * 将给定的集合中的每个元素的toString返回的字符串
	 * 以行单位写入到指定文件中。
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
	 * 从给定的RandomAccessFile当前位置连续读取指定长度的字节量
	 * 并转换为字符串后返回
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
	 * 从指定的文件中读取第一行字符串，并将其转换为long值返回
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
