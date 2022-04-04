package dia1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		Scanner scan = new Scanner(System.in);
		boolean capicua=true;
		int i=0,valorCorrespondiente;
		
		n = scan.next();
		valorCorrespondiente=n.length()-1;
		
		
		while(capicua && i<=(n.length()/2)-1) {
			if(n.charAt(i)!=n.charAt(valorCorrespondiente)) {
				capicua=false;
			}
			i++;
			valorCorrespondiente--;
		}
	
		if(capicua) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}
