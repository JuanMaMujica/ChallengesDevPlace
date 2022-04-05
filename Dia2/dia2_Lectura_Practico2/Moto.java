package dia2_Lectura_Practico2;

public class Moto implements Contable {
	
	private int cantRuedas;
	private float km;
	
	public Moto(int cantRuedas, float km) {
		super();
		this.cantRuedas = cantRuedas;
		this.km = km;
	}
	@Override
	public int cantidadRuedas() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean service() {
		// TODO Auto-generated method stub
		if(km<1500) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	
	
}
