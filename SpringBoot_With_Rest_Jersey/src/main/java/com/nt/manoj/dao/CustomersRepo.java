package com.nt.manoj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.manoj.model.Customers;

public interface CustomersRepo extends JpaRepository<Customers, Integer>{

	public Customers findByCustName(String name); 
	
	
}
