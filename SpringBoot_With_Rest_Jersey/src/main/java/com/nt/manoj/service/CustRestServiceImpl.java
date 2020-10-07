package com.nt.manoj.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.manoj.dao.CustomersRepo;
import com.nt.manoj.model.Customers;

@Component
public class CustRestServiceImpl implements CustRestService{

	@Autowired CustomersRepo repo;

	@Override
	public List<Customers> listOfCustomer() {
		List<Customers> customers=repo.findAll();
		return customers;
	}

	@Override
	public Customers getCustomerById(int id) {
		Customers customers=repo.findById(id).get();
		return customers;
	}

	@Override
	public void insertCustomer(Customers customers) {
		repo.save(customers);
	}

	@Override
	public Customers updateCustomer(Customers customers) {
		Customers customer=repo.save(customers);
		return customers;
	}

	@Override
	public Customers getCustomerByName(String name) {
		Customers c=repo.findByCustName(name);
		return c;
	}

	@Override
	public void delCustomer(String name) {
		boolean bool=StringUtils.isNumeric(name);
		if(bool) {
			int id= Integer.valueOf(name);
			repo.deleteById(id);
		}else {
			Customers customers=repo.findByCustName(name);
			repo.delete(customers);
		}
	}
	
//	@Override
//	public void delCustomerById(int custId) {
//		Customers customers=repo.findById(custId).orElse(null);
//		repo.delete(customers);
//	}
//
//	@Override
//	public void delCustomerByName(String name) {
//		Customers customers=repo.findByCustName(name);
//		repo.delete(customers);
//		
//	}
	
}
