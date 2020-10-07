package com.nt.manoj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.manoj.dao.AlienRepo;
import com.nt.manoj.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home";
	}
	
	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv=new ModelAndView("showAlien");
		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.addObject("alien", alien);
		
//		System.out.println(repo.existsById(104));
//		System.out.println(repo.findAll());
//		System.out.println(repo.count());
//		System.out.println(repo.findByTech("Java"));
//		System.out.println(repo.findByAname("Manoj"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("Java"));
//		System.out.println(repo.findByAidLessThan(103));
		return mv;
	}
}












