package vn.iostar.service.Impl;

import java.util.List;

import vn.iostar.dao.ICategoryDao;
import vn.iostar.dao.Impl.CategoryDaoImpl;
import vn.iostar.entity.CategoryEntity;
import vn.iostar.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {

	ICategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	public List<CategoryEntity> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public CategoryEntity findById(int id) {
		return categoryDao.findById(id);
	}

	@Override
	public void insert(CategoryEntity category) {
		categoryDao.insert(category);
		
	}

	@Override
	public void update(CategoryEntity category) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity = categoryDao.findById(category.getCategoryId());
		if(categoryEntity != null) {
			categoryDao.update(category);
		}
	}

	@Override
	public void delete(int id) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity = categoryDao.findById(id);
		if(categoryEntity != null) {
			categoryDao.delete(id);
		}
	}

	@Override
	public List<CategoryEntity> findByName(String keyword) {
		return categoryDao.findByName(keyword);
	}

}
