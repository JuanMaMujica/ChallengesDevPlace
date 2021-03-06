package dia6_Workshop_Ejercicio;

public class Empleado extends Persona {

	private String aņoDeIncorporacion;
	private int nroDespacho;
	
	public Empleado(String nombre, String apellido, String estadoCivil, int id, String aņoDeIncorporacion, int nroDespacho) {
		super(nombre, apellido, estadoCivil);
		this.aņoDeIncorporacion = aņoDeIncorporacion;
		this.nroDespacho = nroDespacho;
	}
	
	public void cambioDespacho(int nroDespacho) {
		this.nroDespacho = nroDespacho;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [aņoDeIncorporacion=" + aņoDeIncorporacion + ", nroDespacho=" + nroDespacho + "]";
	}
	
	
				
}
