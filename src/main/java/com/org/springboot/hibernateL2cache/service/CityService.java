package com.org.springboot.hibernateL2cache.service;

import org.springframework.stereotype.Service;

import com.org.springboot.hibernateL2cache.entity.City;
import com.org.springboot.hibernateL2cache.repository.CityRepository;

@Service
public class CityService {
	
	private final CityRepository cityRepository;
	
	public CityService(CityRepository cityRepository) {
		
		this.cityRepository = cityRepository;
		
	}
	
	public City getCityById(Integer id) {
		
		return cityRepository.findById(id).get();
		
	}
	
	public City saveCity(City city) {
		
		return cityRepository.save(city);
		
	}

}
