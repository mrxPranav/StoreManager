package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.SupplierLedger;
import com.pranav.store.services.SupplierLedgerService;



@RestController
@RequestMapping("/supplierLedger")
public class SupplierLedgerController {

	@Autowired
	private SupplierLedgerService supplierLedgerService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<SupplierLedger> getPurchase(){
		return supplierLedgerService.getAllSupplierLedgers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public SupplierLedger getPurchase(@PathVariable("id") int id) {
		return supplierLedgerService.getSupplierLedgerById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public SupplierLedger createPurchaseService(@RequestBody SupplierLedger supplierLedger) {
		return supplierLedgerService.createSupplierLedger(supplierLedger);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public SupplierLedger updatePurchaseService(@RequestBody SupplierLedger supplierLedger) {
		return supplierLedgerService.updateSupplierLedger(supplierLedger);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteSupplierLedger(@PathVariable("id") int id) {
		supplierLedgerService.deleteSupplierLedger(id);
		 return "Deleted";
	}
}
