package com.jeff.JeffWeatherApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeff.JeffWeatherApp.model.ZipCode;
import com.jeff.JeffWeatherApp.repository.ZipCodeRepository;

@Service
public class ZipCodeService {
	
	@Autowired
    private ZipCodeRepository zipCodeRepository;

	public List<ZipCode> findAll() {
		// TODO Auto-generated method stub
		List<ZipCode> zipCodes = zipCodeRepository.findAllByOrderByCreatedAtDesc();
		return zipCodes;
	}

	public List<ZipCode> getLastTen() {
		// TODO Auto-generated method stub
		List<ZipCode> zipCodes = zipCodeRepository.findAllByOrderByCreatedAtDesc();
		List<ZipCode> lastTenZipCodes = new ArrayList<>();
		for(int i=0; i<10; i++) {
			lastTenZipCodes.add(zipCodes.get(i));
		}
 		return lastTenZipCodes;
	}


}
