package dia5_Workshop_Ejercicio;

import java.util.ArrayList;

public class JefeDeZona extends Empleado implements Gestionable{
	private Despacho despacho;
	private Secretaria secretario;
	private ArrayList<Vendedor>vendedores;
	private Coche coche;
	
	public JefeDeZona(String nombre, String apellido, String dni, String direccion, String telefono,
			double salarioBasico) {
		super(nombre, apellido, dni, direccion, telefono, salarioBasico);
	}

	public Despacho getDespacho() {
		return despacho;
	}

	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}

	public Secretaria getSecretario() {
		return secretario;
	}

	public void cambiarSecretario(Secretaria secretario) {
		this.secretario = secretario;
	}

	public Coche getCoche() {
		return coche;
	}
	
	@Override
	public void cambiarCoche(Coche coche) {
		this.coche = coche;
	}
	
	@Override
	public void darDeBaja(String dni) {
		for(Vendedor v:vendedores) {
			if(v.getDni()==dni) {
				vendedores.remove(v);
			}
		}
	}

	@Override
	public void darDeAlta(Persona vendedor){
		vendedores.add((Vendedor)vendedor);
	}
	
	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println(this.coche.toString());
	}

	@Override
	public void aumentarSalario() {
		double salario=this.getSalarioBasico();
		salario*=(this.getAñosAntiguedad()*1.2);
		this.setSalario(salario);
	}
	
	public void muestraVendedores() {
		for(Vendedor v:vendedores) {
			System.out.println(v.getApellido());
		}
	}
	
	
	
	
	
}
