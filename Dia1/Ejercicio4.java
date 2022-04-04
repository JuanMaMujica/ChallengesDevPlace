package dia1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Indique los 3 numero a comparar:\na= ");
		a = scan.nextFloat();
		System.out.print("b= ");
		b = scan.nextFloat();
		System.out.print("c= ");
		c= scan.nextFloat();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a es el mayor numero");
			} else {
				System.out.println("c es el mayor numero");
			}
		} else {
			if(b>c) {
				System.out.println("El mayor numero es b");
			} else {
				System.out.println("El mayor numero es c");
			}
		}
	}

}
