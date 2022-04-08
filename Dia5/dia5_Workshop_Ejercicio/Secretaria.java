package dia5_Workshop_Ejercicio;

public class Secretaria extends Empleado{
	private Despacho despacho;
	private String nroFax;
	
	
	public Secretaria(String nombre, String apellido, String dni, String direccion, String telefono,
			double salarioBasico, String nroFax) {
		super(nombre, apellido, dni, direccion, telefono, salarioBasico);
		this.nroFax = nroFax;
		this.despacho=null;
	}
	
	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("\nPuesto: "+this.toString()+"\nDespacho: "+this.despacho.getDireccion()+"\nNumero de Fax: "+this.nroFax);
	}

	@Override
	public String toString() {
		return "Secretaria";
	}

	@Override
	public void aumentarSalario() {
		double salario=this.getSalarioBasico();
		salario*=(this.getAñosAntiguedad()*1.05);
		this.setSalario(salario);
	}
	
	
	
	

	
	
	
	
}
