package vn.iostar.dao;

import java.util.List;

import vn.iostar.entity.UserEntity;

public interface IUserDao {
	List<UserEntity> findAll();
	UserEntity findById(Integer id);
	UserEntity findByUserName(String userName);
	void insert(UserEntity user);
}
