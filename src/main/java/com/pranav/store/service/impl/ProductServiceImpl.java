package com.pranav.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranav.store.model.Product;
import com.pranav.store.repository.ProductRepository;
import com.pranav.store.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository prodRepo ;

	@Override
	public Product createProduct(Product product) {
		product.setEnable(true);
		return prodRepo.save(product);
	}

	@Override
	public Product getProductById(Integer prodId) {
		return prodRepo.findById(prodId).get();
	}

	@Override
	public List<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		product.setEnable(true);
		return prodRepo.save(product);
	}

	@Override
	public void deleteProduct(Integer prodId) {
		prodRepo.deleteById(prodId);

	}

}
