package dia4_Workshop_Ejercicios;

public class Carga extends Vehiculo {

	private Remolque remolque= null;

	public Carga(String matricula, int velocidad) {
		super(matricula, velocidad);
	}
	
	public void ponRemolque(Remolque remolque) {
		this.remolque = remolque;
	}
	
	public void quitaRemolque() {
		this.remolque=null;
	}
	
	@Override
	public void acelerar(int velocidad) throws DemasiadoRapidoException  {
		if(this.getVelocidad()+velocidad>100 && this.remolque!=null) {
			throw new DemasiadoRapidoException("Estas sobrepasando el limite de velocidad");
		} else {
			super.acelerar(velocidad);
		}
	}

	@Override
	public String toString() {
		if(this.remolque!=null) {
			return super.toString()+this.remolque.toString();
		} else {
			return super.toString();
		}
		
	}
	
	
	
	

	
	
}
