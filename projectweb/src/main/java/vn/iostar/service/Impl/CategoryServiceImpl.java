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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(CategoryEntity category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(CategoryEntity category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryEntity> findByName(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
