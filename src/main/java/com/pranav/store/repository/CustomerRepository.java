package com.pranav.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.store.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
