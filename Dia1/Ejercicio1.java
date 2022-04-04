package dia1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float indice,peso,altura;
		
		System.out.print("Ingrese peso(kg) y altura(m) de la persona:\nPeso= ");
		peso = scan.nextFloat();
		System.out.print("Altura= ");
		altura=scan.nextFloat();
		
		indice = (float) (peso/Math.pow(altura, 2));
		
		System.out.print("El estado es: ");
		
		if(indice<20) {
			System.out.println("Mal Estado");
		} else if(indice>=20 && indice<22){
			System.out.println("Bajo de Peso");
		} else if(indice>=22 && indice<25) {
			System.out.println("Peso Normal");
		} else if(indice>=25 && indice<30) {
			System.out.println("Sobrepeso");
		} else if(indice<=30 && indice<40) {
			System.out.println("Sobrepeso crónico");
		} else {
			System.out.println("Hospitalizado");
		}
		
	}

}
