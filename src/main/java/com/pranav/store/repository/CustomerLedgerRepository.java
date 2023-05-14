package com.pranav.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.store.model.CustomerLedger;

public interface CustomerLedgerRepository extends JpaRepository<CustomerLedger, Integer> {

}
