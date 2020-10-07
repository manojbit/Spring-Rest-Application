package com.nt.manoj.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.manoj.dao.CustomersRepo;
import com.nt.manoj.model.Customers;
import com.nt.manoj.service.CustRestServiceImpl;

@RestController
public class CustRestController {

	@Autowired CustRestServiceImpl service;
	
	@GetMapping("/customers")
	public List<Customers> allCustomer(){
		return service.listOfCustomer();
	}

	@GetMapping("/customers/{idOrName}")
	public Customers getOneCustomer2(@PathVariable("idOrName") String idOrName){
		if(StringUtils.isNumeric(idOrName)) {			
			int id= Integer.valueOf(idOrName);
			return service.getCustomerById(id);
		}else {
			return service.getCustomerByName(idOrName);
		}
	}
	
//	@PostMapping("/customers")
//	public void saveCustomer(@RequestBody Customers customers) {
//		service.insertCustomer(customers);
//	}
//	
	@PostMapping("/customers/{id}")
	public Customers updateCustomer(@PathVariable int id,@RequestBody Customers customers) {
		//Customers customers2=service.updateCustomer(customers);
		Customers cust= service.getCustomerById(id);
		cust.setCustName(customers.getCustName());
		cust.setCustAddr(customers.getCustAddr());
		
		//System.out.println(customers);
		Customers c1=service.updateCustomer(cust);
		System.out.println("c1::"+c1);
		return c1;
	}
	
	@DeleteMapping("/customers/{idOrName}")
	public void deleteCustomer(@PathVariable("idOrName") String idOrName ) {
		service.delCustomer(idOrName);
	}

//	@DeleteMapping("/customers/{idOrName}")
//	public void delCustomerById(@PathVariable("idOrName") String custName) {
//		boolean bool=StringUtils.isNumeric(custName);
//		if(bool) {
//			int id= Integer.valueOf(custName);
//			service.delCustomerById(id);
//		}else {
//		service.delCustomerByName(custName);
//		}
//	}
	
}
