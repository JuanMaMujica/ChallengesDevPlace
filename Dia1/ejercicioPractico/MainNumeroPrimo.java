package ejercicioPractico;

import java.util.Scanner;

public class MainNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner scan = new Scanner(System.in);
		Numero num;
		
		System.out.print("Ingrese un numero entre 1 y 14:\nn= ");
		numero = scan.nextInt();
		if(numero>=1 && numero<=14) {
			num = new Numero(numero);
			num.esPrimo();
		}

	}

}
