package org.tedu.cloudnote.service;

import java.security.NoSuchAlgorithmException;

import org.tedu.cloudnote.util.NoteResult;

//���е�seivice����
//public NoteResult xxx(�������);
public interface UserService {
	public NoteResult checkLogin(String name,String password) throws Exception;
	public NoteResult registUser(String name,String password,String nick) throws Exception;
}
