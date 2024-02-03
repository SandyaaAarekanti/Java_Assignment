package com.customerdetails.repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerdetails.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
}