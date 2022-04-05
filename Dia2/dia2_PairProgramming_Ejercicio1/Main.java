package dia2_PairProgramming_Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n,c;
		
		System.out.print("Cuantos paises desea ingresar? ");
		n = scan.nextInt();
		Pais array[] = new Pais[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Ingrese el nombre del pais: ");
			array[i]= new Pais(scan.next());
		}
		
		System.out.print("Cuantos ciudades desea ingresar?: ");
		c = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i].getNombre());
			for(int j=0;j<c;j++) {
				System.out.print("Ingrese el nombre del ciudad: ");
				array[i].agregarCiudad(scan.next());
			}
		}
		
		for(int i=0;i<n;i++) {
			array[i].mostrarCiudades();
		}
		
		
	}

}
