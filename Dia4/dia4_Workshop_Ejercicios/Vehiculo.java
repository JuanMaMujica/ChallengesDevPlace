package dia4_Workshop_Ejercicios;

public class Vehiculo {
	private String matricula;
	private int velocidad;
	
	public Vehiculo(String matricula, int velocidad) {
		this.matricula = matricula;
		this.velocidad = velocidad;
	}
	
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.velocidad=0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelerar(int velocidad) throws DemasiadoRapidoException  {
		this.velocidad+=velocidad;
	}
	
	public void desacelerar(int velocidad) {
		if(this.velocidad<velocidad) {
			this.velocidad = 0;
		} else {
			this.velocidad-=velocidad;
		}
	}


	@Override
	public String toString() {
		return "Vehiculo:\n\tMatricula: "+this.getMatricula()+"\n\tVelocidad: "+this.getVelocidad();
	}
	
	
	
	
	
	
	
}
