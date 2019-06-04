package com.lovo.diancan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lovo.diancan.entity.CategoryEntity;
@Service
public interface CategoryService {
	public int addCate(CategoryEntity cate);
	public int delCate(Integer id);
	public int updateCate(Integer id,String cateName,String cateType);
	public List<CategoryEntity> findAllCate();

}
