package com.sts.rest.productservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Product;
import com.sts.rest.repository.ProdRepository;

@Service
public class ProdServices {

	@Autowired
	private ProdRepository serviceRepo;
	public List<Product> getAllProducts(){
		List<Product> list=new ArrayList<Product>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}
	
	public void addProduct(Product product) {
		this.serviceRepo.save(product);
	}
	
	public void updateProduct(Integer id, Product product) {
		this.serviceRepo.save(product);
	}
	
	public void deleteProduct(Integer id) {
		this.serviceRepo.deleteById(id);
	}

	
	
}
