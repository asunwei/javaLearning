package org.tedu.cloudnote.service;

import java.security.NoSuchAlgorithmException;

import org.tedu.cloudnote.util.NoteResult;

//所有的seivice方法
//public NoteResult xxx(请求参数);
public interface UserService {
	public NoteResult checkLogin(String name,String password) throws Exception;
	public NoteResult registUser(String name,String password,String nick) throws Exception;
}
