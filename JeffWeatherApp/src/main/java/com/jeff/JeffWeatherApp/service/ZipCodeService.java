package com.jeff.JeffWeatherApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

	public List<ZipCode> findAllLimit(Pageable limit) {
		// TODO Auto-generated method stub
		List<ZipCode> zipCodes = zipCodeRepository.findAllByOrderByCreatedAtDesc();
		return zipCodes;
	}


}
