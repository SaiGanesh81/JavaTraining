package com.sts.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.rest.entity.Product;



@Repository
public interface ProdRepository extends CrudRepository<Product, Integer>{

}

