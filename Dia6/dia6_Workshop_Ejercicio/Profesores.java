package dia6_Workshop_Ejercicio;

public class Profesores extends Persona{
	private String departamento;

	public Profesores(String nombre, String apellido, String estadoCivil, int id, String departamento) {
		super(nombre, apellido, estadoCivil);
		this.departamento = departamento;
	}
	
	public void cambioDepartamento(String departamento) {
		this.cambioDepartamento(departamento);
	}

	@Override
	public String toString() {
		return super.toString()+"Profesores [departamento=" + departamento + "]";
	}
	
	
	
}
