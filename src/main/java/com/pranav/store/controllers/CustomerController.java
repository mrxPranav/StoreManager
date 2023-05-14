package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.Customer;
import com.pranav.store.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		 return "Deleted";
	}

}
