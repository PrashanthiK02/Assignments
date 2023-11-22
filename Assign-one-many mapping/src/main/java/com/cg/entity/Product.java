package com.cg.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prod")
public class Product {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 private int id;
 private String name;

public Product(String name) {
	super();
	this.name = name;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}


 }