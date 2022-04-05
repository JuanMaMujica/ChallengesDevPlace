package dia2_PairProgramming_Ejercicio1;

import java.util.Vector;

public class Pais {
	
	private String nombre;
	private Vector<String>ciudades = new Vector<String>();
	
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCiudad(String ciudad) {
		ciudades.add(ciudad);
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void mostrarCiudades() {
		System.out.print("Las ciudades de "+ nombre+ " son: ");
		for(String i:ciudades) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
}
