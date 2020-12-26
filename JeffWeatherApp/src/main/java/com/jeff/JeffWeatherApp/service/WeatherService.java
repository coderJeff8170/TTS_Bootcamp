package com.jeff.JeffWeatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.jeff.JeffWeatherApp.model.Response;
import com.jeff.JeffWeatherApp.model.ZipCode;
import com.jeff.JeffWeatherApp.repository.ZipCodeRepository;

@Service
public class WeatherService {
	//this can come from application properties, or environment variables, the latter being secure and the former, not
    @Value("${api_key}")
    private String apiKey;
    
    @Autowired
    private ZipCodeRepository zipCodeRepository;
    
    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
            zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try {
        	ZipCode zipcode = new ZipCode();
			zipcode.setZipCode(zipCode);
			zipCodeRepository.save(zipcode);
            return restTemplate.getForObject(url, Response.class);
        }
        catch (HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }
    
    
    
	
    
}
