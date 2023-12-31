package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productId")
private Long id;
	@Column(name="productName",length=100)
private String name;
	@Column(name="brand",length=100)
private String brand;
	@Column(name="madeIn",length=100)
private String madeIn;
	@Column(name="price")
private float price;
public Product() {
	super();
}
public Product(Long id, String name, String brand, String madeIn, float price) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.madeIn = madeIn;
	this.price = price;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMadeIn() {
	return madeIn;
}
public void setMadeIn(String madeIn) {
	this.madeIn = madeIn;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", madeIn=" + madeIn + ", price=" + price
			+ "]";
}

}
