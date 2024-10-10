package vn.iostar.service.Impl;

import vn.iostar.dao.IUserDao;
import vn.iostar.dao.Impl.UserDaoImpl;
import vn.iostar.entity.UserEntity;
import vn.iostar.service.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao userDao = new UserDaoImpl();
	@Override
	public UserEntity login(String username, String passWord) {
		UserEntity userEntity = this.findByUserName(username);
		if(userEntity != null && passWord.equals(userEntity.getPassWord())) {
			return userEntity;
		}
		return null;
	}

	@Override
	public UserEntity findByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
