package cn.tedu.mapper;

import java.util.List;

import cn.tedu.entity.Admin;
/**
 * ������������findAll��������
 * findAll��AdminMapper.xml�еķ�����idһ��
 *
 */
public interface AdminMapper {
	/**
	 * <select id = "findAll">
	 * @return
	 */
	List<Admin> findAll();
}
