package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.productservices.ProdServices;
import com.sts.rest.entity.Product;

@RestController
@RequestMapping("/rest/hello")
public class ProductController {
	
	@Autowired
	private ProdServices service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/product/{prodid}")
	public List<Product> getAllProducts(@PathVariable Integer prodid){
		return this.service.getAllProducts();
		
	}
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product product) {
		 this.service.addProduct(product);
	}
	
	@DeleteMapping("/delproduct/{prodid}")
	public void delProduct(@PathVariable Integer prodid) {
     this.service.deleteProduct(prodid);
	}
	
	@PutMapping("/updateproduct/{prodid}")
	public void updateProduct(@PathVariable Integer prodid, @RequestBody Product product) {
     this.service.updateProduct(prodid, product);
	}
}

