package cn.tedu.mapper;

import java.util.List;

import cn.tedu.entity.Admin;
/**
 * 将方法名声明findAll声明出来
 * findAll与AdminMapper.xml中的方法名id一致
 *
 */
public interface AdminMapper {
	/**
	 * <select id = "findAll">
	 * @return
	 */
	List<Admin> findAll();
}
