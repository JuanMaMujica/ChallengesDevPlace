package dia5_PairProgramming;

public class Moto extends Vehiculo {
	private boolean casco;
	private boolean vtv;

	public Moto(String patente, Persona due�o, double peso, boolean casco,boolean vtv) {
		super(patente, due�o, peso);
		this.casco = casco;
		this.vtv = vtv;
	}
	

	public boolean isCasco() {
		return casco;
	}


	public void setCasco(boolean casco) {
		this.casco = casco;
	}


	public boolean isVtv() {
		return vtv;
	}


	public void setVtv(boolean vtv) {
		this.vtv = vtv;
	}


	@Override
	public boolean puedoPasar() {
		if(this.casco && this.vtv && this.getPeso()<200) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
