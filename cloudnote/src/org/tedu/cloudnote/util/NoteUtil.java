package org.tedu.cloudnote.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

public class NoteUtil {
	/**
	 * 密码加密
	 * @param src 明文
	 * @return 密文
	 * @throws NoSuchAlgorithmException 
	 */
	public static String md5(String src) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] input = src.getBytes();
		byte[] output = md.digest(input); 
		//采用base64将output转成字符串
		String dest = Base64.encodeBase64String(output);
		return dest;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		String s = md5("123");
		System.out.println(s);
		String s1 = md5("123456");
		System.out.println(s1);
	}
	
	/**
	 * 生成表的主键ID
	 * @return 利用UUID产生一个字符串值
	 */
	public static String creatId(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
