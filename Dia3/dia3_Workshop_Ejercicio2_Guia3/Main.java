package dia3_Workshop_Ejercicio2_Guia3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila = new Pila(3);
		Scanner scan = new Scanner(System.in);
		
		while(!pila.full()) {
			System.out.println("Ingresa un elemento a la pila");
			pila.push(scan.nextInt());
		}
		
		System.out.println("La suma de los elementos de la pila es= "+ sumaPila(pila));
		
	}
	
	public static int sumaPila(Pila pila) {
		if(pila.empty()) {
			return 0;
		} else {
			return pila.pop() + sumaPila(pila);
		}
	}

}
