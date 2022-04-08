package dia5_PairProgramming;

public class Camion extends Vehiculo {
	private Remolque remolque;

	public Camion(String patente, Persona dueño, double peso) {
		super(patente, dueño, peso);
		this.remolque=null;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void agregarRemolque(Remolque remolque) {
		this.remolque = remolque;
	}
	
	public void sacarRemolque() {
		this.remolque=null;
	}

	@Override
	public boolean puedoPasar() {
		double pesoTotal;
		if(this.remolque!=null) {
			pesoTotal = this.getPeso()+this.remolque.getPeso();
		} else {
			pesoTotal=this.getPeso();
		}
		if(pesoTotal>7500) {
			return false;
		} else {
			return true;
		}

	
	}
	
	
	
}
