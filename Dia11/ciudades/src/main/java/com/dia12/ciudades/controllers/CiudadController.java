package com.dia12.ciudades.controllers;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dia12.ciudades.models.CiudadModel;
import com.dia12.ciudades.services.CiudadService;

@RestController
@RequestMapping(path = "/ciudades")
public class CiudadController {
	
	
	@PostMapping("/ingreso")
	public String ingresaCiudad(@RequestBody CiudadModel ciudad ) {
		CiudadService cs = new CiudadService();
		try {
			cs.insertCiudad(ciudad);
			return "Ingreso exitoso";
		} catch (SQLException e) {
			return "Ingreso fallido";
		}
	}
	
	@GetMapping("/getCiudad/{id}")
	public String getCiudad(@PathVariable("id") int id) {
		CiudadService cs = new CiudadService();
		try {
			cs.selectCiudad(id);
		//	return cs.selectCiudad(id).toString();
			return "Exito";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return "Esta vacio ves";
		}
		
	}
		
	
}
