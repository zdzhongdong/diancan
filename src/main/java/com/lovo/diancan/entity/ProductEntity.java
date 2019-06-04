package com.lovo.diancan.entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ProductEntity {
	@Id
	@GenericGenerator(name="tuuid",strategy = "uuid")
	@GeneratedValue(generator = "tuuid")
	private String pId;
	private String pName;
	private BigDecimal pPrice;
	/**库存*/
	private int pStock;
	/**描述*/
	private String pDescription;
	private String Pimg;
	private int categoryType;
	private String createTime=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public BigDecimal getpPrice() {
		return pPrice;
	}
	public void setpPrice(BigDecimal pPrice) {
		this.pPrice = pPrice;
	}
	public int getpStock() {
		return pStock;
	}
	public void setpStock(int pStock) {
		this.pStock = pStock;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public String getPimg() {
		return Pimg;
	}
	public void setPimg(String pimg) {
		Pimg = pimg;
	}
	public int getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}
	public String getCreateTime() {
		return createTime;
	}
	
}
