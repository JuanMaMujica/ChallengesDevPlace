package dia6_PairProgramming;

public class Ejecutivo extends Empleado implements StrategySueldos {

	public Ejecutivo(String nombre, String apellido, double sueldo) {
		super(nombre, apellido, sueldo);

	}

	@Override
	public double calculaAumento() {
		return getsueldo() * 1.15;
	}
}
