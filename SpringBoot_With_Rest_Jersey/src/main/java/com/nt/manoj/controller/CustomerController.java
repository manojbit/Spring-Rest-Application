package com.nt.manoj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nt.manoj.dao.CustomersRepo;
import com.nt.manoj.model.Customers;

@Controller
public class CustomerController {

	@Autowired CustomersRepo repo;
	
	@GetMapping("/cust")
	public String openCustomer() {
		return "cust";
	}
	
	@PostMapping(value = "/getCustomer")
	public ModelAndView showCustomer(@RequestParam("custId") int id) {
		ModelAndView mv=new ModelAndView("showAllCustomer");
		Customers customers= repo.findById(id).orElse(new Customers());
		mv.addObject("customer", customers);
		return mv;
	}
	
	@PostMapping(value = "/insertCustomer")
	public ModelAndView insertCustomer(Customers customers) {
		ModelAndView mv=new ModelAndView("showAllCustomer");
		System.out.println("1");
		Customers c=repo.save(customers);
		
		mv.addObject("customer", c);
		return mv;
	}
}
