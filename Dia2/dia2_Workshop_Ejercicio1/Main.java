package dia2_Workshop_Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		boolean valido=false;
		char op;
		String teclado;
		float a,b;
		
		while(!valido) {
			System.out.print("Ingrese la operacion a realizar s(Suma), r(Resta), m(Multiplicacion), d(Division): ");
			teclado = scan.next();
			teclado = teclado.toLowerCase();
			op = teclado.charAt(0);
			System.out.print("Ingrese los valores a y b de su operacion:\na= ");
			a = scan.nextFloat();
			System.out.print("b= ");
			b = scan.nextFloat();
			
			switch(op) {
			case 's':
				calc.setOperacion(op);
				System.out.println("a + b = "+calc.suma(a, b));
				valido = true;
				break;
			case 'r':
				calc.setOperacion(op);
				System.out.println("a - b = "+calc.resta(a, b));
				valido = true;
				break;
			case 'm':
				calc.setOperacion(op);
				System.out.println("a * b = "+calc.multiplicacion(a, b));
				valido = true;
				break;
			case 'd':
				calc.setOperacion(op);
				System.out.println("a / b = "+ calc.division(a, b));
				valido = true;
				break;
			}
		}
	}

}
