package com.api27.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api27.Model.Person;
import com.api27.Repository.PersonRepository;

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
