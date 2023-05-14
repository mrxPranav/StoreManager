package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.CustomerLedger;
import com.pranav.store.model.Purchase;

public interface PurchaseService {
	
	Purchase createPurchase(Purchase purchase);

	Purchase getPurchaseById(Integer purchaseId);

	List<Purchase> getAllPurchases();

	Purchase updatePurchase(Purchase purchase);

	void deletePurchase(Integer purchaseId);

}
