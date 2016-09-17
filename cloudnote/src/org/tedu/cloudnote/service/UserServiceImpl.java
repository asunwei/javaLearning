package org.tedu.cloudnote.service;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tedu.cloudnote.dao.UserDao;
import org.tedu.cloudnote.entity.User;
import org.tedu.cloudnote.util.NoteResult;
import org.tedu.cloudnote.util.NoteUtil;
@Service("userService")//ɨ��
@Transactional//
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;//ע��
	public NoteResult checkLogin(String name, String password) throws NoSuchAlgorithmException {
		NoteResult result = new NoteResult();
		//����û���
		User user = userDao.findByName(name);
		if(user == null){
			result.setStatus(1);
			result.setMsg("�û�������");
			return result;
		}
		//���û������password����
		String md5_pwd = NoteUtil.md5(password);
		//���ıȶ�
		if(!user.getCn_user_password().equals(md5_pwd)){
			result.setStatus(2);
			result.setMsg("�������");
			return result;
		}
		result.setStatus(0);
		result.setMsg("��¼�ɹ�");
		//���û���ID���ظ�Ajax�ص�����
		result.setData(user.getCn_user_id());
		return result;
	}
	public NoteResult registUser(String name, String password, String nick) throws NoSuchAlgorithmException {
		NoteResult result = new NoteResult();
		//�û���Ψһ�Լ��
		User has_user = userDao.findByName(name);
		if(has_user!=null){
			result.setStatus(1);
			result.setMsg("�û����Ѵ���");
			return result;
		}
		//����û���Ϣ
		User user = new User();
		String userId = NoteUtil.creatId();
		user.setCn_user_id(userId);//����id
		user.setCn_user_name(name);//�����û���
		String md5_pwd = NoteUtil.md5(password);
		user.setCn_user_password(md5_pwd);//��������
		user.setCn_user_nick(nick);//�����ǳ�
		userDao.save(user);//����û�
		result.setStatus(0);
		result.setMsg("ע���û��ɹ�");
		return result;
	}

}
