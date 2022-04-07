package dia4_Workshop_Ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carga camion = new Carga("abc123",50);
		Particular auto = new Particular("qwe456",150,4);
		Remolque r1 = new Remolque(200,"reml123","20612312");
		
		camion.ponRemolque(r1);
		System.out.println(camion.toString());
		System.out.println(auto.toString());
		
		try {
			camion.acelerar(60);
		} catch (DemasiadoRapidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		System.out.println(camion.toString());
		
		camion.quitaRemolque();
		
		try {
			auto.acelerar(10);
		} catch (DemasiadoRapidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		auto.desacelerar(100);
		try {
			camion.acelerar(150);
		} catch (DemasiadoRapidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(auto.toString());
		System.out.println(camion.toString());
		
		
	}

}
