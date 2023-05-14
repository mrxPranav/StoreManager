package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product getProductById(Integer prodId);

	List<Product> getAllProducts();

	Product updateProduct(Product product);

	void deleteProduct(Integer prodId);
}
