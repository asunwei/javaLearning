package org.tedu.cloudnote.service;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tedu.cloudnote.dao.UserDao;
import org.tedu.cloudnote.entity.User;
import org.tedu.cloudnote.util.NoteResult;
import org.tedu.cloudnote.util.NoteUtil;
@Service("userService")//扫描
@Transactional//
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;//注入
	public NoteResult checkLogin(String name, String password) throws NoSuchAlgorithmException {
		NoteResult result = new NoteResult();
		//检查用户名
		User user = userDao.findByName(name);
		if(user == null){
			result.setStatus(1);
			result.setMsg("用户不存在");
			return result;
		}
		//将用户输入的password加密
		String md5_pwd = NoteUtil.md5(password);
		//密文比对
		if(!user.getCn_user_password().equals(md5_pwd)){
			result.setStatus(2);
			result.setMsg("密码错误");
			return result;
		}
		result.setStatus(0);
		result.setMsg("登录成功");
		//把用户的ID返回给Ajax回调函数
		result.setData(user.getCn_user_id());
		return result;
	}
	public NoteResult registUser(String name, String password, String nick) throws NoSuchAlgorithmException {
		NoteResult result = new NoteResult();
		//用户名唯一性检测
		User has_user = userDao.findByName(name);
		if(has_user!=null){
			result.setStatus(1);
			result.setMsg("用户名已存在");
			return result;
		}
		//添加用户信息
		User user = new User();
		String userId = NoteUtil.creatId();
		user.setCn_user_id(userId);//设置id
		user.setCn_user_name(name);//设置用户名
		String md5_pwd = NoteUtil.md5(password);
		user.setCn_user_password(md5_pwd);//设置密码
		user.setCn_user_nick(nick);//设置昵称
		userDao.save(user);//添加用户
		result.setStatus(0);
		result.setMsg("注册用户成功");
		return result;
	}

}
