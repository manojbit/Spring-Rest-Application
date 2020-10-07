package com.nt.manoj.service;

import java.util.List;

import com.nt.manoj.model.Customers;

public interface CustRestService {

	public List<Customers> listOfCustomer();
	
	public Customers getCustomerById(int id);
	
	public void insertCustomer(Customers customers);
	
	public Customers updateCustomer(Customers customers);
	
	public Customers getCustomerByName(String name);
	
	//public void delCustomerById(int custId);
	
	//public void delCustomerByName(String name);
	
	public void delCustomer(String name);
}
