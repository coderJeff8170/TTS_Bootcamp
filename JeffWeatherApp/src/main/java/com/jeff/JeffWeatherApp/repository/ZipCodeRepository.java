package com.jeff.JeffWeatherApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeff.JeffWeatherApp.model.ZipCode;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {

	List<ZipCode> findAllByOrderByCreatedAtDesc();
    
}
