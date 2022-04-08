package dia5_Workshop_Ejercicio;

public class Cliente extends Persona{
	
	private static int nroCliente=0;
	private int id;
	
	public Cliente(String nombre, String apellido, String dni, String direccion, String telefono) {
		super(nombre, apellido, dni, direccion, telefono);
		this.id = ++nroCliente;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
