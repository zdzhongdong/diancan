package com.lovo.diancan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lovo.diancan.dao.CategoryDao;
import com.lovo.diancan.entity.CategoryEntity;
import com.lovo.diancan.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao cdao;
	@Override
	public int addCate(CategoryEntity cate) {
		// TODO Auto-generated method stub
		int i = -1;
		CategoryEntity ategoryEntity = cdao.save(cate);
		if(null!=ategoryEntity) {
			i = 1;
		}
		return i;
	}

	@Override
	public int delCate(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCate(Integer id, String cateName, String cateType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CategoryEntity> findAllCate() {
		// TODO Auto-generated method stub
		return null;
	}

}
