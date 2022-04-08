package dia5_PairProgramming;

public class Multa {
	private String fecha;
	private double monto;
	
	public Multa(String fecha, double monto) {
		this.fecha = fecha;
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Multa [fecha=" + fecha + ", monto=" + monto + "]";
	}
	
	
	
	
}
