package dia5_Workshop_Ejercicio;

public abstract class Empleado extends Persona {

	private int a�osAntiguedad;
	private double salarioBasico;
	private double salario;
	private Empleado supervisor;

	public Empleado(String nombre, String apellido, String dni, String direccion, String telefono,
			double salarioBasico) {
		super(nombre, apellido, dni, direccion, telefono);
		this.salarioBasico = salarioBasico;
		this.salario=this.salarioBasico;
	}
	
	

	public double getSalarioBasico() {
		return salarioBasico;
	}
	

	public int getA�osAntiguedad() {
		return a�osAntiguedad;
	}



	public double getSalario() {
		return salario;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setA�osAntiguedad(int a�osAntiguedad) {
		this.a�osAntiguedad = a�osAntiguedad;
	}

	public void cambiarSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
	public void imprimirDatos() {
		System.out.print("Nombre: " + super.getNombre()+"\nApellido: "+super.getApellido()+"\nDni: "+super.getDni()+"\nDireccion: "+super.getDireccion()+"\nTelefono: "+super.getTelefono()+"\nSalario: "+this.salario+"\nAntguedad:"+this.a�osAntiguedad);
	}
	
	public abstract void aumentarSalario();
	
	
	


	
	
	
	
	
}
