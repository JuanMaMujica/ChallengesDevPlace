package dia4_Workshop_Ejercicios;

public class Particular extends Vehiculo{
	
	private int nroPuertas;

	public Particular(String matricula, int velocidad, int nroPuertas) {
		super(matricula, velocidad);
		this.nroPuertas = nroPuertas;
	}

	public Particular(String matricula, int nroPuertas) {
		super(matricula);
		this.nroPuertas = nroPuertas;
	}

	public int getNroPuertas() {
		return nroPuertas;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\tNro Puertas: "+this.nroPuertas;
	}
	
	
	
	
	
	
	
	
}
