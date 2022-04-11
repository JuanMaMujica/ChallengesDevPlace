package dia6_PairProgramming;

public class Sueldos {
	private StrategySueldos empleado;

	public Sueldos(StrategySueldos empleado) {
		this.empleado = empleado;
	}
	
	public double calcularAumento() {
		return this.empleado.calculaAumento();
	}
	
	public void cambiaEmpleado(StrategySueldos empleado) {
		this.empleado = empleado;
	}
	
}
