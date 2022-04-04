package ejercicioPractico;

public class Numero {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}
	
	public void esPrimo() {
		int cantidadDivisores = 0;
		
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) {
				cantidadDivisores++;
			}
		}
		switch(cantidadDivisores) {
		case 2:
			System.out.println("El numero es primo");
			break;
		default:
			System.out.println("El numero no es primo");
		}
	}
	
}
