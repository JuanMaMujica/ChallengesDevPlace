package dia3_Workshop_Ejercicio4_Guia2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cantPaises,cantCiudades;
		
		System.out.print("Indique la cantidad de paises: ");
		cantPaises = scan.nextInt();
		System.out.print("Indique la cantidad de ciudades por pais a ingresar: ");
		cantCiudades= scan.nextInt();

		String array[][] = new String [cantPaises][(cantCiudades+1)];
		
		agregaPaises(array,cantPaises);
		agregaCiudades(array,cantPaises,cantCiudades);
		mostrarMatriz(array,cantPaises,cantCiudades);
		
		
		
	}
	
	public static void agregaPaises(String array[][],int cantPaises){
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<cantPaises;i++) {
			System.out.println("Pais "+i+": ");
			array[i][0]=scan.nextLine();
		}

	}
	
	public static void agregaCiudades(String array[][],int cantPaises, int cantCiudades) {
		
		Scanner scan= new Scanner(System.in);
		for(int i=0;i<cantPaises;i++) {
			System.out.println("Las ciudades de "+array[i][0]+" son: ");
			for(int j=1;j<=cantCiudades;j++) {
				array[i][j] = scan.nextLine();
			}
		}
	}
	
	public static void mostrarMatriz(String array[][],int cantPaises,int cantCiudades) {
		for (int i=0;i<cantPaises;i++) {
			System.out.print(array[i][0]+": ");
			for(int j=1;j<=cantCiudades;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
