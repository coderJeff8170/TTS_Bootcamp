package com.tts.myAwesomeProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")//home directory! it's a route!
	public String home() {
		return "Hello World, wanna banana!!";
	}

}
