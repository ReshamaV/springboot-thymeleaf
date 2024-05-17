package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("inside about handler...");
		//putting data in model
		model.addAttribute("name", "Reshama");
		model.addAttribute("currentdate", new Date().toLocaleString());
		return "about";
	}
	//handling iteration
	@GetMapping("/example-loop")
	public String iteratorHandler(Model m)
	{
		List<String> names = List.of("Ankit","Laxmi","John","Karan");
		m.addAttribute("names", names);
		return "iterator";
	}
	//handler for conditional Statement
	@GetMapping("/condition")
	public String conditionalHandler(Model m)
	{
		System.out.println("Conditional Handler executead..");
		m.addAttribute("isActive",false);
		m.addAttribute("gender","F");
		List<Integer> list = List.of(34,37,86,575,298,33);
		m.addAttribute("MyList",list);
		return "condition";
	}

	//Handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m)
	{
		m.addAttribute("title","I like to sing a song");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	
	//for learning inheriting template
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}
}
