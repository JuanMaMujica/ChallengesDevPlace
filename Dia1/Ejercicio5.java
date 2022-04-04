package dia1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Indique los numeros a comparar:\na= ");
		a = scan.nextFloat();
		System.out.print("b= ");
		b= scan.nextFloat();
		System.out.print("c= ");
		c= scan.nextFloat();
		
		if(a<b) {
			if(a<c) {
				System.out.println("a es el menor numero");
			} else {
				System.out.println("c es el menor numero");
			}
		} else {
			if(b<c) {
				System.out.println("b es el menor numero");
			} else {
				System.out.println("c es el menor numero");
			}
		}
	}

}
