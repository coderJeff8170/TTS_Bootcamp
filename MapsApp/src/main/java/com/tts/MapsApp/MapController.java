package com.tts.MapsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MapController {
	@Autowired
	private MapService mapService;
	@GetMapping(value = {"/home", "/"})
	public String getDefaultMap(Model model) {
		model.addAttribute("location", new Location());
		return "index";
	}
	/**
	 * Stuff for stuffing stuff
	 * @param location
	 * @param model
	 * @return
	 */
	@PostMapping("/home")
	public String getMapForLocation(Location location, Model model) {
		mapService.addCoordinates(location);
		model.addAttribute("location", location);
		return "index";
	}
	
	
	//don't need a location apparently, and it's a post - go figure
	@PostMapping("/rando")
	public String getMapForRandoLocation( Model model) {
		//put coordinates into location object from generator function in svcs
		Location location = mapService.addRandoCoordinates();
		//add the object to the page
		model.addAttribute("location", location);
		return "index";
	}
	
	//get a random city
	//we're changing the page, so POST
	@PostMapping("/randoCity")
	//We don't need a location, because again, we'll make one randomly
	public String getMapForRandoCity( Model model) {
		Location location = mapService.getRandomCity();
		model.addAttribute("location", location);
		return "index";
	}
	
	
	
}

//@Controller
//public class MapController {
//	@Autowired
//	private MapService mapService;
//	
//	
//	@GetMapping("/home")
//	public String getDefaultMap(Model model) {
//		model.addAttribute(new Location());
//		return "index.html";
//	}
//	
//	@PostMapping("/home")
//	public String getMapForLocation(Location location, Model model) {
//		mapService.addCoordinates(location);
//		model.addAttribute(location);
//		return "index.html";
//	}
//}
