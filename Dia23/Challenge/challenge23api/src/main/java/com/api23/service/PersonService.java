package com.api23.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api23.model.Person;
import com.api23.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository pr;
	
	public List<Person> getAll(){
		return pr.findAll();
	}
	
	public Person get(long dni) {
		return pr.getById(dni);
	}
	
	public void insert(Person p) {
		if(!pr.existsById(p.getDni())) {
			pr.save(p);
		}
	}
	
	public void update(Person p) {
		if(pr.existsById(p.getDni())) {
			pr.save(p);
		}
	}
	
	public void delete(long dni) {
		pr.deleteById(dni);
	}
	
}
