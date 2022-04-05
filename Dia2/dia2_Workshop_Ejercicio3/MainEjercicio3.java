package dia2_Workshop_Ejercicio3;

import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[10];
		llenaArray(array);
		System.out.println("El mayor numero del arreglo es: "+muestraMayor(array));
		System.out.println("El menor numero del arreglo es: "+muestraMenor(array));
		muestraImpares(array);
		muestraPares(array);
		ordenarDescendente(array);
		System.out.print("Los numero en forma descendente son: ");
		muestraArray(array);
		ordenarAscendente(array);
		System.out.println("\nLos numero en forma ascendente son: ");
		muestraArray(array);

		
		
		
		
	}

	public static void llenaArray(int array[]) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.print("Ingrese el elemento "+i+": ");
			array[i] = scan.nextInt();
		}
		scan.close();
	}
	
	public static int muestraMayor(int array[]) {
		int mayor=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	public static int muestraMenor(int array[]) {
		int menor = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<menor) {
				menor = array[i];
			}
		}
		return menor;
	}
	
	public static void muestraImpares(int array[]) {
		System.out.print("Los numeros impares en el array son: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==1) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
	}
	
	public static void muestraPares(int array[]) {
		System.out.print("Los numeros pares en el array son: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
	}
	
	public static void ordenarAscendente(int array[]) {
		int aux;
		for(int i=0;i<array.length;i++) {
			for(int j = i; j<array.length;j++) {
				if(array[j]<array[i]) {
					aux = array[i];
					array[i] = array[j];
					array[j]=aux;
				}
			}
		}
	}
	
	public static void ordenarDescendente(int array[]) {
		int aux;
		for(int i=0;i<array.length;i++) {
			for(int j = i; j<array.length;j++) {
				if(array[j]>array[i]) {
					aux = array[i];
					array[i] = array[j];
					array[j]=aux;
				}
			}
		}
	}
	
	public static void muestraArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
