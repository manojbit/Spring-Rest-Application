package com.nt.manoj.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nt.manoj.model.Alien;

@Controller
public class HomeController {

//	@RequestMapping("home")
//	//@ResponseBody             // it says whatever you are returning is actually data not a pagename. 
//	public String home(HttpServletRequest req) {
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
//		System.out.println("hiiii "+ name);
//		session	.setAttribute("name", name);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public String home(@RequestParam("name") String name1,HttpSession session) {
//
//		System.out.println("hiiii "+ name1);
//		session	.setAttribute("name", name1);
//		return "home";
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("name",myName);
//		mv.setViewName("home");
//		return mv;
//	}
	
	
	@RequestMapping("home")
	public ModelAndView home( Alien alien) {

		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home"); 
		return mv;
	}
	
}
