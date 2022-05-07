package com.api23.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api23.model.Person;
import com.api23.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private PersonService ps;
	
	@GetMapping
	public ArrayList<Person> getAll(){
		return (ArrayList<Person>) ps.getAll();
	}
	
	@GetMapping("/{dni}")
	public Person get(@PathVariable("dni") long dni) {
		return ps.get(dni);
	}
	
	@PostMapping
	public void insert(@RequestBody Person p ) {
		ps.insert(p);
	}
	
	@PutMapping
	public void update(@RequestBody Person p) {
		ps.update(p);
	}
	
	@DeleteMapping("/{dni}")
	public void delete(@PathVariable("dni") long dni) {
		ps.delete(dni);
	}
	
	
}
