package dia6_PairProgramming;

public class Obrero extends Empleado implements StrategySueldos{
	
	
	
	
	public Obrero(String nombre, String apellido, double sueldo) {
		super(nombre, apellido, sueldo);

	}

	@Override
	public double calculaAumento() {
		return getsueldo() * 1.05;
	}
	
	

}
