package com.tts.MapsApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {
	@Value("${api_key}")
	private String apiKey;
	
	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + location.getCity() + "," + location.getState() + "&key=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();
		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());
	}
	
	public Location addRandoCoordinates() {
		Location location = new Location();
		location.setLat(String.valueOf((Math.random() * 180.0) - 90.0));
		location.setLng(String.valueOf((Math.random() * 360.0) - 180.0));
		//location.setCity();
		//location.setState();
		
		return location;
	}
	
	//https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=YOUR_API_KEY   <-- example rev call
	
	//returns a location object created here, but with an api call to id city?
	public Location getRandomCity() {
		//make a location object:
		Location location = new Location();
		location.setLat(String.valueOf((Math.random() * 180.0) - 90.0));
		location.setLng(String.valueOf((Math.random() * 360.0) - 180.0));
		//get the info from google thru rev geocoding:
		//set URL for request
		String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + location.getLat() + "," + location.getLng() + "&key=" + apiKey;
		
		//format proper response object to store returned info
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location city = response.getResults().get(0).getGeometry().getLocation();
		//add city info to location
		location.setCity(city.getCity());
		location.setState(city.getState());
		
		//return it
		return location;
	}
}
