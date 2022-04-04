package dia1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		float discriminante,x1,x2;
		System.out.print("Indique el valor de los coeficiente del termino de segundo y primer grado y del término independiente:\na= ");
		a = scan.nextInt();
		System.out.print("b= ");
		b = scan.nextInt();
		System.out.print("c= ");
		c = scan.nextInt();
		
		discriminante = (int) (Math.pow(b, 2) - (4*a*c));
		System.out.println(discriminante);
		
		if(discriminante < 0) {
			System.out.println("Las raices son imaginarias");
		} else if(discriminante == 0) {
			x1 = - b / 2*a;
			x2=x1;
			System.out.println("Las raices x1 y x2 son iguales:\nx1= "+x1+"\nx2= "+x2);
		} else {
			x1 = (float) ((- b + Math.sqrt(discriminante))/(2*a));
			x2 = (float) ((- b - Math.sqrt(discriminante))/(2*a));
			System.out.println("Las raices son:\nx1= "+x1+"\nx2= "+x2);
		}
		
	}

}
