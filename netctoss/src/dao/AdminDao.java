package dao;

import entity.Admin;

public interface AdminDao {
	Admin findById(String adminCode);
}
