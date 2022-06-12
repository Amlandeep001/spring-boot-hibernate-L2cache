package com.org.springboot.hibernateL2cache.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.hibernateL2cache.entity.City;
import com.org.springboot.hibernateL2cache.service.CityService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cityapp")
@Slf4j
public class CityController {

	private final CityService cityService;

	public CityController(CityService cityService) {

		this.cityService = cityService;

	}
	
	@GetMapping("/cities/{id}")
	public ResponseEntity<City> getCityById(@PathVariable(name = "id") Integer id){
		
		log.info("Fetching city information with id: {}", id);
		
		return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
	}
	
	@PostMapping("/cities")
	public ResponseEntity<City> saveCity(@RequestBody City city){
		
		log.info("Saving city information for city object: {}", city.toString());
		
		return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
	}

}
