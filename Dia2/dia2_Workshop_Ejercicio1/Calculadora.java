package dia2_Workshop_Ejercicio1;

public class Calculadora {
	private char operacion;

	public Calculadora() {
	}


	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}
	
	public float suma(float a, float b) {
		return a + b;
	}
	
	public float resta(float a,float b) {
		return a - b;
	}
	
	public float multiplicacion(float a, float b) {
		return a * b;
	}
	
	public float division(float a, float b) {
		return a / b;
	}
	
}
