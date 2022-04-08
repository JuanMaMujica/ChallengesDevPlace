package dia5_PairProgramming;

public abstract class Vehiculo {
	private String patente;
	private Persona	dueño;
	private double peso;
	
	public Vehiculo(String patente, Persona dueño, double peso) {
		this.patente = patente;
		this.dueño = dueño;
		this.peso = peso;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract	boolean puedoPasar();
	
	
	
}
