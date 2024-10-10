package vn.iostar.dao;

import java.util.List;

import vn.iostar.entity.CategoryEntity;

public interface ICategoryDao {
	List<CategoryEntity> findAll();

	CategoryEntity findById(int id);

	void insert(CategoryEntity category);

	void update(CategoryEntity category);

	void delete(int id);

	List<CategoryEntity> findByName(String keyword);
}
