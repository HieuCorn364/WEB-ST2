package vn.iostar.service;

import vn.iostar.entity.UserEntity;

public interface IUserService {
	UserEntity login(String username, String passWord);
	
	UserEntity findByUserName(String username);
}
