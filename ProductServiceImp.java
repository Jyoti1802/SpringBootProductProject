package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductServiceImp {
	
@Autowired
 ProductRepository repo;
	 
	//getting all products record by using the method findaAll() of CrudRepository  
	 public List<Product> getAllProducts()   
	 {  
	 List<Product> product = new ArrayList<Product>();  
	 repo.findAll().forEach(product1 -> product.add(product1));  
	 return product;  
	 } 
	 
	 //getting a specific record by using the method findById() of CrudRepository  
	 public Product getProductById(int productId)   
	 {  
	 return repo.findById(productId).get();  
	 }  
	 
	 //saving a specific record by using the method save() of CrudRepository  
	 public void saveOrUpdate(Product product)   
	 {  
	 repo.save(product);  
	 } 
	 
	 //deleting a specific record by using the method deleteById() of CrudRepository  
	 public void delete(int productId)   
	 {  
	 repo.deleteById(productId);  
	 }  
	 
	 //updating a record  
	 public void update(Product product, int productId)   
	 {  
	 repo.save(product);  
	 }  
	 
	 

	
	
}
