package com.bandiClasses.DMS.repository;
//Author:SAI TEJA SARVANI MAJJI

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog>findByName(String name);

}
