package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Body;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BodyRepository extends CrudRepository<Body, Long> {

	public Body findByNum(String num);
	public Body findByName(String name);
}