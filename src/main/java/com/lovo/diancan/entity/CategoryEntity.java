package com.lovo.diancan.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryEntity {
	@Id
	private Integer cateId;
	private String cateName;
	private int cateType;
	private String createTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
	public Integer getCateId() {
		return cateId;
	}
	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public int getCateType() {
		return cateType;
	}
	public void setCateType(int cateType) {
		this.cateType = cateType;
	}
	public String getCreateTime() {
		return createTime;
	}
	
	
}
