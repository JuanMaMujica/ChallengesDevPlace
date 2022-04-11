package dia6_Workshop_Ejercicio;

public class PersonalDeServicio extends Empleado{
	private String seccionAsignada;

	public PersonalDeServicio(String nombre, String apellido, String estadoCivil, int id, String a�oDeIncorporacion,
			int nroDespacho, String seccionAsignada) {
		super(nombre, apellido, estadoCivil, id, a�oDeIncorporacion, nroDespacho);
		this.seccionAsignada = seccionAsignada;
	}
	
	
	public void cambioSeccion(String seccionNueva) {
		this.seccionAsignada=seccionNueva;
	}


	@Override
	public String toString() {
		return super.toString()+"PersonalDeServicio [seccionAsignada=" + seccionAsignada + "]";
	}
	
	
	
}
