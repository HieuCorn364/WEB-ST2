package vn.iostar.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iostar.config.DBConnectMySQL;
import vn.iostar.dao.ICategoryDao;
import vn.iostar.entity.CategoryEntity;

public class CategoryDaoImpl implements ICategoryDao{

	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;
	@Override
	public List<CategoryEntity> findAll() {
		String query = "SELECT * FROM categories";
		List<CategoryEntity> categoryEntities = new ArrayList<CategoryEntity>();
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				CategoryEntity categoryEntity = new CategoryEntity();
				categoryEntity.setCategoryId(resultSet.getInt("categoryid"));
				categoryEntity.setCategoryName(resultSet.getString("categoryname"));
				categoryEntity.setImages(resultSet.getString("images"));
				categoryEntity.setStatus(resultSet.getInt("status"));
				categoryEntities.add(categoryEntity);
			}
			connection.close();
			preparedStatement.close();
			resultSet.close();
			return categoryEntities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CategoryEntity findById(int id) {
		String query = "SELECT * FROM categories WHERE categoryid = ?";
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				CategoryEntity categoryEntity = new CategoryEntity();
				categoryEntity.setCategoryId(resultSet.getInt("categoryid"));
				categoryEntity.setCategoryName(resultSet.getString("categoryname"));
				categoryEntity.setImages(resultSet.getString("images"));
				categoryEntity.setStatus(resultSet.getInt("status"));
				return categoryEntity;
			}
			connection.close();
			preparedStatement.close();
			resultSet.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public void insert(CategoryEntity category) {
		String query = "insert into categories(categoryname, images, status) values (?,?,?)";
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, category.getCategoryName());
			preparedStatement.setString(2, category.getImages());
			preparedStatement.setInt(3, category.getStatus());
			preparedStatement.executeUpdate();
			connection.close();
			preparedStatement.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void update(CategoryEntity category) {
		String query = "UPDATE categories set categoryname = ?, images = ?, status = ? WHERE categoryid = ?";
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, category.getCategoryName());
			preparedStatement.setString(2, category.getImages());
			preparedStatement.setInt(3, category.getStatus());
			preparedStatement.setInt(4, category.getCategoryId());
			preparedStatement.executeUpdate();
			connection.close();
			preparedStatement.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void delete(int id) {
		String query = "DELETE FROM categories WHERE categoryid = ?";
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			connection.close();
			preparedStatement.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<CategoryEntity> findByName(String keyword) {
		String query = "SELECT * FROM categories WHERE categoryname like ?";
		List<CategoryEntity> categoryEntities = new ArrayList<CategoryEntity>();
		try {
			Connection connection = DBConnectMySQL.getDatabaseConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "%" + keyword + "%");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				CategoryEntity categoryEntity = new CategoryEntity();
				categoryEntity.setCategoryId(resultSet.getInt("categoryid"));
				categoryEntity.setCategoryName(resultSet.getString("categoryname"));
				categoryEntity.setImages(resultSet.getString("images"));
				categoryEntity.setStatus(resultSet.getInt("status"));
				categoryEntities.add(categoryEntity);
			}
			connection.close();
			preparedStatement.close();
			resultSet.close();
			return categoryEntities;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
