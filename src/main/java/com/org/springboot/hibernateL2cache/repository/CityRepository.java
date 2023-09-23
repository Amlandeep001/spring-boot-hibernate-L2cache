package com.org.springboot.hibernateL2cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springboot.hibernateL2cache.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>
{
}
