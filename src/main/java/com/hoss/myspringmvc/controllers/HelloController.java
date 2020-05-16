package com.hoss.myspringmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/add")
	ModelAndView addNumbers(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView(); 
		System.out.println("hiiiii 2");
		System.out.println("hiiiii 3");
		System.out.println("I want to play football man");
		mv.setViewName("/WEB-INF/display.jsp");
		mv.addObject("val", "Hi");
		return mv;
	}
}
