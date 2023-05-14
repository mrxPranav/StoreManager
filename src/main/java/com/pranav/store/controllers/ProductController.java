package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.Product;
import com.pranav.store.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Product> getProducts(){
		return prodService.getAllProducts();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return prodService.getProductById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return prodService.createProduct(product);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return prodService.updateProduct(product);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("id") int id) {
		 prodService.deleteProduct(id);
		 return "Deleted";
	}
		
}
