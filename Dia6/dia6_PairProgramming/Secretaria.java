package dia6_PairProgramming;

public class Secretaria extends Empleado implements StrategySueldos{
	
	public Secretaria(String nombre, String apellido, double sueldo) {
		super(nombre, apellido, sueldo);

	}

	@Override
	public double calculaAumento() {
		return getsueldo() * 1.1;
	}
	
	
}
