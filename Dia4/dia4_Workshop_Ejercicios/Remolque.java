package dia4_Workshop_Ejercicios;

public class Remolque {
	private int peso;
	private String matricula;
	private String dniTitular;
	
	public Remolque(int peso, String matricula, String dniTitular) {
		this.peso = peso;
		this.matricula = matricula;
		this.dniTitular = dniTitular;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	@Override
	public String toString() {
		return "\n\tRemolque:\n\t\tMatricula: "+this.matricula+"\n\t\tDni Titular: "+this.dniTitular+"\n\t\tPeso: "+this.peso;
	}
	
	
	
	
	
}
