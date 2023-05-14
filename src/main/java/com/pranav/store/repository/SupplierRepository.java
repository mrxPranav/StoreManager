package com.pranav.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranav.store.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
