package com.org.springboot.hibernateL2cache.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "city")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class City {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	Integer id;
	
	String name;
	
	Long population;

}
