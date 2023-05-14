package com.pranav.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.store.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
