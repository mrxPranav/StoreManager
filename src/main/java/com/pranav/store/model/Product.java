package com.pranav.store.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prodName;
	private String prodCategory;
	private String prodSize;
	private String prodColor;
	private String prodDescription;
	private String prodPrice1;
	private String prodPrice2;
	private boolean enable;
	
	public Product(int id, String prodName, String prodCategory, String prodSize, String prodColor,
			String prodDescription, String prodPrice1, String prodPrice2, boolean enable) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodSize = prodSize;
		this.prodColor = prodColor;
		this.prodDescription = prodDescription;
		this.prodPrice1 = prodPrice1;
		this.prodPrice2 = prodPrice2;
		this.enable = enable;
	}
	
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public String getProdSize() {
		return prodSize;
	}
	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	public String getProdDescription() {
		return prodDescription;
	}
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	public String getProdPrice1() {
		return prodPrice1;
	}
	public void setProdPrice1(String prodPrice1) {
		this.prodPrice1 = prodPrice1;
	}
	public String getProdPrice2() {
		return prodPrice2;
	}
	public void setProdPrice2(String prodPrice2) {
		this.prodPrice2 = prodPrice2;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
