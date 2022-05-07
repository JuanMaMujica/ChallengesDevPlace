package com.api23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api23.model.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Long>{
	
}
