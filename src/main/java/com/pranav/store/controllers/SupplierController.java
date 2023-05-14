package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.Supplier;
import com.pranav.store.services.SupplierService;



@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Supplier> getPurchase(){
		return supplierService.getAllSuppliers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Supplier getPurchase(@PathVariable("id") int id) {
		return supplierService.getSupplierById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Supplier createPurchaseService(@RequestBody Supplier supplier) {
		return supplierService.createSupplier(supplier);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Supplier updatePurchaseService(@RequestBody Supplier supplier) {
		return supplierService.updateSupplier(supplier);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deletePurchase(@PathVariable("id") int id) {
		supplierService.deleteSupplier(id);
		 return "Deleted";
	}
}
