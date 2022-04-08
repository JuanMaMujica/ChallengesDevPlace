package dia5_PairProgramming;

public class Auto extends Vehiculo{
	private boolean vtv;

	public Auto(String patente, Persona dueño, double peso, boolean vtv) {
		super(patente, dueño, peso);
		this.vtv = vtv;
	}

	public boolean isVtv() {
		return vtv;
	}

	public void setVtv(boolean vtv) {
		this.vtv = vtv;
	}

	@Override
	public boolean puedoPasar() {
		
		if(this.getPeso()<500 && this.vtv) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
