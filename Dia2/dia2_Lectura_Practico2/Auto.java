package dia2_Lectura_Practico2;

public class Auto implements Contable {
	private int cantRuedas;
	private float km;
	
	
	public Auto(int cantRuedas, float km) {
		super();
		this.cantRuedas = cantRuedas;
		this.km = km;
	}
	@Override
	public int cantidadRuedas() {
		// TODO Auto-generated method stub
		return cantRuedas;
	}
	@Override
	public boolean service() {
		// TODO Auto-generated method stub
		if(km<3000) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
}
