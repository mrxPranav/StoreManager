package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.Purchase;
import com.pranav.store.model.Supplier;

public interface SupplierService {

	Supplier createSupplier(Supplier supplier);

	Supplier getSupplierById(Integer supId);

	List<Supplier> getAllSuppliers();

	Supplier updateSupplier(Supplier supplier);

	void deleteSupplier(Integer supId);
}
