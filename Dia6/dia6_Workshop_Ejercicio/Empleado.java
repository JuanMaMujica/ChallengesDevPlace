package dia6_Workshop_Ejercicio;

public class Empleado extends Persona {

	private String a�oDeIncorporacion;
	private int nroDespacho;
	
	public Empleado(String nombre, String apellido, String estadoCivil, int id, String a�oDeIncorporacion, int nroDespacho) {
		super(nombre, apellido, estadoCivil);
		this.a�oDeIncorporacion = a�oDeIncorporacion;
		this.nroDespacho = nroDespacho;
	}
	
	public void cambioDespacho(int nroDespacho) {
		this.nroDespacho = nroDespacho;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [a�oDeIncorporacion=" + a�oDeIncorporacion + ", nroDespacho=" + nroDespacho + "]";
	}
	
	
				
}
