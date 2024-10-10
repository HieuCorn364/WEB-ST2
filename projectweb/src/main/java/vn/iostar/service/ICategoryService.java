package vn.iostar.service;

import java.util.List;

import vn.iostar.entity.CategoryEntity;

public interface ICategoryService {
	List<CategoryEntity> findAll();
	CategoryEntity findById(int id);
	void insert(CategoryEntity category);
	void update(CategoryEntity category);
	void delete(int id);
	List<CategoryEntity> findByName(String keyword);
}
