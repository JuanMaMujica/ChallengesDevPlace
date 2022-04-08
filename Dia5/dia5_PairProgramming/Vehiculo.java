package dia5_PairProgramming;

public abstract class Vehiculo {
	private String patente;
	private Persona	due�o;
	private double peso;
	
	public Vehiculo(String patente, Persona due�o, double peso) {
		this.patente = patente;
		this.due�o = due�o;
		this.peso = peso;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Persona getDue�o() {
		return due�o;
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract	boolean puedoPasar();
	
	
	
}
