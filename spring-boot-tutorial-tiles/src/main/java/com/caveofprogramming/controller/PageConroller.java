package com.caveofprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageConroller {
	
	@RequestMapping("/about")
	String about() {
		return "app.about";
	}
	
	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}
}
