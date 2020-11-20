package com.tts.cars.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//vv allows us to output to browser with no view!
@RestController
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("cars")
	public String cars() {
		return "cars";
	}
	//vv defines default route
//	@RequestMapping("/")
//	public String home() {
//		return "Hello world";
//	}
//	
	

}
