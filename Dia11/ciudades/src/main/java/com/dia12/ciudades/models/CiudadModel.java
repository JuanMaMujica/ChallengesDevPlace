package com.dia12.ciudades.models;

public class CiudadModel {
	private int id;
	private String nombre;
	private int poblacion;
	private String provincia;
	
	public CiudadModel(int id, String nombre, int poblacion, String provincia) {
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.provincia = provincia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id+ ", nombre=" + nombre + ", poblacion=" + poblacion + ", provincia=" + provincia
				+ "]";
	}
	
	
	
	
	
}
