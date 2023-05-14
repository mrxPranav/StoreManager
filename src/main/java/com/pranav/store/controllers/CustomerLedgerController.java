package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.CustomerLedger;
import com.pranav.store.services.CustomerLedgerService;


@RestController
@RequestMapping("/customerLedger")
public class CustomerLedgerController {

	@Autowired
	private CustomerLedgerService customerLedgerService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<CustomerLedger> getCustomers(){
		return customerLedgerService.getAllCustomerLedgers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public CustomerLedger getCustomer(@PathVariable("id") int id) {
		return customerLedgerService.getCustomerLedgerById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public CustomerLedger createCustomer(@RequestBody CustomerLedger customerLedger) {
		return customerLedgerService.createCustomerLedger(customerLedger);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public CustomerLedger updateCustomer(@RequestBody CustomerLedger customerLedger) {
		return customerLedgerService.updateCustomerLedger(customerLedger);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("id") int id) {
		customerLedgerService.deleteCustomerLedger(id);
		 return "Deleted";
	}
}
