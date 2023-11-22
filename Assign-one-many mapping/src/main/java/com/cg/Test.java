package com.cg;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Product;
import com.cg.util.JPAUtil;
import com.cg.entity.Brand;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.OneToMany;


public class Test {
	public static void main(String args[])
	{
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction e=em.getTransaction();
		e.begin();
		Product p1=new Product("Jean");
		Product p2=new Product("top");
		
		List<Product> products=new ArrayList<>();
		products.add(p1);
		products.add(p2);
		
		Brand brand=new Brand();
		brand.setName("ZARA");
		brand.setProducts(products);
		em.persist(brand);
		e.commit();
		em.close();
	}
}
