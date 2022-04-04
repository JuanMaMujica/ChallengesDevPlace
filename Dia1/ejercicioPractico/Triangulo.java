package ejercicioPractico;

public class Triangulo {
	private int lado1, lado2, lado3;
	
	public Triangulo (int lado1,int lado2,int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public int getLado3() {
		return lado3;
	}
	
	public void tipoDeTriangulo() {
		
		int cantidadLadosIguales = 0;
		
		if(lado1 == lado2) {
			cantidadLadosIguales++;
		}
		if(lado1==lado3) {
			cantidadLadosIguales++;
		}
		if(lado2==lado3 && lado1!=lado2) {
			cantidadLadosIguales++;
		}
		
		switch(cantidadLadosIguales) {
			case 2: 
				System.out.println("El triangulo es equilatero");
				break;
			case 1:
				System.out.println("El triangulo es isosceles");
				break;
			default:
				System.out.println("El triangulo es escaleno");
		}
		
	}
}
