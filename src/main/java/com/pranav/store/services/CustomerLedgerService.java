package com.pranav.store.services;

import java.util.List;

import com.pranav.store.model.CustomerLedger;

public interface CustomerLedgerService {
	CustomerLedger createCustomerLedger(CustomerLedger customer);

	CustomerLedger getCustomerLedgerById(Integer custLedId);

	List<CustomerLedger> getAllCustomerLedgers();

	CustomerLedger updateCustomerLedger(CustomerLedger custLedId);

	void deleteCustomerLedger(Integer custLedId);

}
