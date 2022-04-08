package dia5_Workshop_Ejercicio;

import java.util.ArrayList;


public class Vendedor extends Empleado implements Gestionable{
	private Coche coche;
	private String telefonoMovil;
	private String areaDeVenta;
	private ArrayList<Cliente>clientes;
	
	


	public Vendedor(String nombre, String apellido, String dni, String direccion, String telefono, double salarioBasico,
			String telefonoMovil, String areaDeVenta) {
		super(nombre, apellido, dni, direccion, telefono, salarioBasico);
		this.telefonoMovil = telefonoMovil;
		this.areaDeVenta = areaDeVenta;
		this.clientes = new ArrayList<Cliente>();
	}
	
	


	public String getTelefonoMovil() {
		return telefonoMovil;
	}




	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}




	public String getAreaDeVenta() {
		return areaDeVenta;
	}




	public void setAreaDeVenta(String areaDeVenta) {
		this.areaDeVenta = areaDeVenta;
	}



	@Override
	public void darDeBaja(String dni) {
		for(Cliente c:clientes) {
			if(c.getDni()==dni) {
				clientes.remove(c);
			}
		}
	}

	@Override
	public void darDeAlta(Persona cliente) {
		clientes.add((Cliente)cliente);
	}

	@Override
	public void cambiarCoche(Coche coche) {
		this.coche = coche;
	}
	
	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("\nTelefono Movil: "+this.telefonoMovil+"\nArea de Venta: "+this.areaDeVenta+this.coche.toString());
	}


	@Override
	public void aumentarSalario() {
		double salario=this.getSalarioBasico();
		salario*=(this.getAñosAntiguedad()*1.1);
		this.setSalario(salario);
		
	}
	
	public void muestraClientes() {
		for(Cliente c:clientes) {
			System.out.println(c.getApellido());
		}
	}
}
