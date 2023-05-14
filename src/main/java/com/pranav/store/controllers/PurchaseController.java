package com.pranav.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.store.model.Purchase;
import com.pranav.store.services.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Purchase> getPurchase(){
		return purchaseService.getAllPurchases();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Purchase getPurchase(@PathVariable("id") int id) {
		return purchaseService.getPurchaseById(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Purchase createPurchaseService(@RequestBody Purchase purchase) {
		return purchaseService.createPurchase(purchase);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Purchase updatePurchaseService(@RequestBody Purchase purchase) {
		return purchaseService.updatePurchase(purchase);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deletePurchase(@PathVariable("id") int id) {
		purchaseService.deletePurchase(id);
		 return "Deleted";
	}
}
