package com.jeff.JeffWeatherApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeff.JeffWeatherApp.model.Request;
import com.jeff.JeffWeatherApp.model.Response;
import com.jeff.JeffWeatherApp.model.ZipCode;
import com.jeff.JeffWeatherApp.service.WeatherService;
import com.jeff.JeffWeatherApp.service.ZipCodeService;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    
    @Autowired
    private ZipCodeService zipCodeService;
    
//    @GetMapping
//    public String getIndex(Model model) {
//        Response response = weatherService.getForecast("43210");
//        model.addAttribute("data", response);
//        return "index";
//    }
    
    //attribute to hold list of recent zipcodes
    @ModelAttribute("zipCodes")
    public List<ZipCode> zipCodes() {
    	return zipCodeService.getLastTen();
    }
    
    
    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());  
        return "index";
    }
    
    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        System.out.println(data);
        model.addAttribute("data", data);
        //make list of zipCodes available to 'index'
        model.addAttribute("zipCodes");
        return "index";
    }
    
    @RequestMapping(value = "/{zipCode}", method = RequestMethod.GET)
    public String getIndexWithId(@PathVariable String zipCode, Model model) {
    	Response data = weatherService.getForecast(zipCode);

    	model.addAttribute("data", data);
    	
        return "weatherPage";
    }
    
//    @RequestMapping(value = "/{zipCode}", method = RequestMethod.GET)
//    public String getIndexWithId(@PathVariable String zipCode, Model model) {
//    	Response data = weatherService.getForecast(zipCode);
//        //Optional<BlogPost> post = blogPostRepository.findById(id);
////        if (post.isPresent()) {
////            BlogPost actualPost = post.get();
////            model.addAttribute("blogPost", actualPost);
////        }
//    	System.out.println(data);
//
//        return "test";
//    }
//    
    
}
