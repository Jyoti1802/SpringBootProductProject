package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producttable")
public class Product {

	@Id
	private int productId;
	private String name,productType,category;
	private double basePrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, String productType, String category, double basePrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", productType=" + productType + ", category="
				+ category + ", basePrice=" + basePrice + "]";
	}
	
	
	
	
}
