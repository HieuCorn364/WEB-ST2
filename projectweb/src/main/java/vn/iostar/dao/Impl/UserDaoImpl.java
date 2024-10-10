package vn.iostar.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iostar.config.DBConnectMySQL;
import vn.iostar.dao.IUserDao;
import vn.iostar.entity.UserEntity;

public class UserDaoImpl extends DBConnectMySQL implements IUserDao {

	public Connection connection = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	@Override
	public List<UserEntity> findAll() {
		String sql = "SELECT * FROM user";
		List<UserEntity> list = new ArrayList<UserEntity>();
		try {
			connection = super.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				UserEntity userEntity = new UserEntity();
				userEntity.setId(resultSet.getInt("id"));
				userEntity.setFullName(resultSet.getString("fullname"));
				userEntity.setUserName(resultSet.getString("username"));
				userEntity.setPhone(resultSet.getString("phone"));
				userEntity.setAddress(resultSet.getString("address"));
				userEntity.setRoleId(resultSet.getInt("roleid"));
				list.add(userEntity);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserEntity findById(Integer id) {
		
		return null;
	}

	@Override
	public void insert(UserEntity user) {
		String sql = "INSERT INTO user(fullname,username,password,address,email,roleid) VALUES (?,?,?,?,?,?)";
		try {
			connection = super.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getFullName());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getPassWord());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getEmail());
			preparedStatement.setInt(6, user.getRoleId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		UserDaoImpl userDao = new UserDaoImpl();
		
//		userDao.insert(new UserEntity("kim ly","haho","1","Binh Thuan",2));
//		for(UserEntity user: userDao.findAll())
		System.out.println(userDao.findByUserName("ly"));
	}

	@Override
	public UserEntity findByUserName(String userName) {
		String sql = "SELECT * FROM user WHERE username = ?";
		try {
			connection = super.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				UserEntity userEntity = new UserEntity();
				userEntity.setId(resultSet.getInt("id"));
				userEntity.setFullName(resultSet.getString("fullname"));
				userEntity.setUserName(resultSet.getString("username"));
				userEntity.setPassWord(resultSet.getString("password"));
				userEntity.setPhone(resultSet.getString("phone"));
				userEntity.setAddress(resultSet.getString("address"));
				userEntity.setRoleId(resultSet.getInt("roleid"));
				return userEntity;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
