package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductServiceImp;

@RestController
public class ProductController {

	//Autowire productServiceImp class
   @Autowired
   public ProductServiceImp service;

 //creating a get mapping that retrieves all the products detail from the database  
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
    	  return service.getAllProducts();
    }
    
  //creating a get mapping that retrieves the detail of a specific product  
    @GetMapping("/product/{productId}")  
    private Product getProduct(@PathVariable("productId") int productId)   
    {  
    return service.getProductById(productId);  
    }  
    
    //creating a delete mapping that deletes a specified book  
    @DeleteMapping("/product/{productId}")  
    private void deleteProduct(@PathVariable("productId") int productId)   
    {  
         service.delete(productId);  
    }  
    
    //creating post mapping that post the product detail in the database  
    @PostMapping("/addproducts")  
    private int saveProduct(@RequestBody Product product)   
    {  
    service.saveOrUpdate(product);  
    return product.getProductId();  
    } 
    
    //creating put mapping that updates the product detail   
    @PutMapping("/updateProduct")  
    private Product update(@RequestBody Product product)   
    {  
    service.saveOrUpdate(product);  
    return product;  
    }  
}
