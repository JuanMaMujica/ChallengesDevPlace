package dia6_Workshop_Ejercicio;

public class Empleado extends Persona {

	private String añoDeIncorporacion;
	private int nroDespacho;
	
	public Empleado(String nombre, String apellido, String estadoCivil, int id, String añoDeIncorporacion, int nroDespacho) {
		super(nombre, apellido, estadoCivil);
		this.añoDeIncorporacion = añoDeIncorporacion;
		this.nroDespacho = nroDespacho;
	}
	
	public void cambioDespacho(int nroDespacho) {
		this.nroDespacho = nroDespacho;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [añoDeIncorporacion=" + añoDeIncorporacion + ", nroDespacho=" + nroDespacho + "]";
	}
	
	
				
}
