package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.SupplierLedger;

public interface SupplierLedgerService {
	
	SupplierLedger createSupplierLedger(SupplierLedger supplier);

	SupplierLedger getSupplierLedgerById(Integer supLedId);

	List<SupplierLedger> getAllSupplierLedgers();

	SupplierLedger updateSupplierLedger(SupplierLedger supplier);

	void deleteSupplierLedger(Integer supLedId);

}
