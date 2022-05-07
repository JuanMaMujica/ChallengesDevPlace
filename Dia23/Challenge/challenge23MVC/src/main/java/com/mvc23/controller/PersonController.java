package com.mvc23.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc23.controller.service.PersonService;
import com.mvc23.model.Person;

@Controller
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonService ps;
	
	@GetMapping
	public String showList(Model model) {
		ArrayList<Person> persons = ps.getAll();
		model.addAttribute("persons", persons);
		return "indexPerson";
	}
	
	@GetMapping("/create")
	public String showCreateForm(Model model) {
		Person person = new Person();
		model.addAttribute("person", person);
		return "createPerson";
	}
	
	@PostMapping("/create")
	public String createPerson(@ModelAttribute("person") Person p) {
		ps.insert(p);
		return "redirect:/persons";
	}
	
	@GetMapping("/update/{dni}")
	public String showUpdatePerson(Model model, @PathVariable("dni") long dni) {
		Person person = ps.get(dni);
		model.addAttribute("person", person);
		return "updatePerson";
	}
	
	@PostMapping("/update")
	public String updatePerson(@ModelAttribute("person") Person p) {
		ps.update(p);
		return "redirect:/persons";
	}
	
	@GetMapping("/delete/{dni}")
	public String delete(@PathVariable("dni") long dni) {
		ps.delete(dni);
		return "redirect:/persons";
	}
}
