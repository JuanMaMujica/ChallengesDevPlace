package com.mvc23.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mvc23.model.Person;

@Service
public class PersonService {
	
	private String url= "http://localhost:8080/persons/";

	public ArrayList<Person> getAll(){
		RestTemplate restT= new RestTemplate();
		return restT.getForObject(url, ArrayList.class);
	}
	
	public Person get(long dni) {
		RestTemplate restT= new RestTemplate();
		String urlGet = url + dni;
		Person p = restT.getForObject(urlGet, Person.class);
		return p;
	}
	
	public void insert(Person p) {
		RestTemplate restT= new RestTemplate();
		restT.postForObject(url, p, Person.class);
	}
	
	public void update(Person p) {
		RestTemplate restT= new RestTemplate();
		restT.put(url, p);
	}
	
	public void delete(long dni) {
		RestTemplate restT= new RestTemplate();
		String urlDel = url + dni;
		restT.delete(urlDel);
	}
	
}
