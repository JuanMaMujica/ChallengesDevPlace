package dia1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float notaFinal,nota1,nota2,nota3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Indique las notas de los examenes:\n Nota 1= ");
		nota1 = scan.nextFloat();
		System.out.print("Nota 2= ");
		nota2 = scan.nextFloat();
		System.out.print("Nota3= ");
		nota3 = scan.nextFloat();
		
		notaFinal = (nota1 + nota2 + nota3) / 3;
		
		if(notaFinal < 10) {
			System.out.println("Reprobado");
		} else if(notaFinal>=10 && notaFinal<15){
			System.out.println("Aprobado");
		} else {
			System.out.println("Eximido");
		}
	}

}
