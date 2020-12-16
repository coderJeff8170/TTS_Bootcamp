package com.jeff.JeffWeatherApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    	Pageable limit = PageRequest.of(0,10);
        return zipCodeService.findAllLimit(limit);
    }
    
    
    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());  
        return "index";
    }
    
    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        //make list of zipCodes available to 'index'
        model.addAttribute("zipCodes");
        return "index";
    }
}
