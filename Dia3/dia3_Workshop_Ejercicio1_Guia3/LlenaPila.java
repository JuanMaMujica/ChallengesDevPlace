package dia3_Workshop_Ejercicio1_Guia3;

import java.util.Scanner;

public class LlenaPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila = new Pila(5);
		Scanner scan= new Scanner(System.in);
		
		
		while(!pila.full()) {
			System.out.println("Ingresa un elemento a la pila");
			pila.push(scan.nextInt());
		}
		
		System.out.println(pila.top());
		
		while(!pila.empty()) {
			System.out.println(pila.pop());
		}
		
	}

}
