package com.tts.EcommerceTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.EcommerceTest.models.Product;
import com.tts.EcommerceTest.repositories.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }	

}
