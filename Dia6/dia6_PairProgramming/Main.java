package dia6_PairProgramming;

public class Main {

	public static void main(String[] args) {
		
		StrategySueldos ob = new Obrero("Oscar","Acevedo",5000);
		StrategySueldos sec = new Secretaria("Oscar","Acevedo",10000);
		StrategySueldos eje = new Ejecutivo("Oscar","Acevedo",30000);
		
		Sueldos sueldo = new Sueldos(ob); 
		
		System.out.println("El nuevo sueldo del obrero es: "+sueldo.calcularAumento());
		
		sueldo.cambiaEmpleado(sec);
		
		System.out.println("El nuevo sueldo de la secretaria es: "+ sueldo.calcularAumento());
		
		sueldo.cambiaEmpleado(eje);
		
		System.out.println("El nuevo sueldo del ejecutivo es: "+sueldo.calcularAumento());
		
	}

}
