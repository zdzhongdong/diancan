package com.lovo.diancan.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lovo.diancan.entity.CategoryEntity;
@Repository
public interface CategoryDao extends CrudRepository<CategoryEntity, Integer>{

}
