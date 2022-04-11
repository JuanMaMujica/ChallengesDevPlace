package dia6_Workshop_Ejercicio;

public class Persona {
	private static int numeroID=0;
	private String nombre;
	private String apellido;
	private String estadoCivil;
	private int id;
	
	public Persona(String nombre, String apellido, String estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.id = ++numeroID;
	}
	
	public void cambioEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", id=" + id
				+ "]";
	}
	
	
	
	
}
