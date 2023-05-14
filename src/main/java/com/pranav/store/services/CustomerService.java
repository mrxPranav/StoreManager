package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);

	Customer getCustomerById(Integer custId);

	List<Customer> getAllCustomers();

	Customer updateCustomer(Customer custId);

	void deleteCustomer(Integer custId);

}
