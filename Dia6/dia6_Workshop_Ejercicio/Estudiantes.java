package dia6_Workshop_Ejercicio;

import java.util.ArrayList;

public class Estudiantes extends Empleado{
	private ArrayList<String> materiasMatriculadas;

	public Estudiantes(String nombre, String apellido, String estadoCivil, int id, String a�oDeIncorporacion,
			int nroDespacho) {
		super(nombre, apellido, estadoCivil, id, a�oDeIncorporacion, nroDespacho);
		this.materiasMatriculadas = new ArrayList<String>();
	}
	
	public void agregaMatriculacionCurso(String cursadaMatricula) {
		this.materiasMatriculadas.add(cursadaMatricula);
	}

	@Override
	public String toString() {
		return super.toString()+"Estudiantes [materiasMatriculadas=" + materiasMatriculadas + "]";
	}
	
	
	
	
}
