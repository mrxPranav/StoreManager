package com.pranav.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.store.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
