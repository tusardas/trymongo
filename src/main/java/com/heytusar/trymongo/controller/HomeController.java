package com.heytusar.trymongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@CrossOrigin
	@RequestMapping("/")
	public String index(Model model) {
		String copyrightInfo = "<strong>&copy; 2020</strong> All rights protected.";
		model.addAttribute("copyrightInfo", copyrightInfo);
		
		List<String> tasks = new ArrayList<String>();
		tasks.add("Eat");
		tasks.add("Sleep");
		tasks.add("Code");
		model.addAttribute("tasks", tasks);
		
		log.info("model ----------------------> " + model);
		
		return "index";
	} 
}
