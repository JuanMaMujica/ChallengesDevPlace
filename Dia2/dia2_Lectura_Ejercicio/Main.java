package dia2_Lectura_Ejercicio;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabras[] = {"curso", "devplace", "personas", "coder", "alumnado"};
		Arrays.sort(palabras);
		
		for(int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i].toString());
		}
	}
	
	public static void ordenar(String palabras[]) {
		String aux;
		int count=0;
		for(int i=0;i<palabras.length-1;i++) {
			for(int j=i;j<palabras.length-1;j++) {
				String actual = palabras[j];
				String siguiente = palabras[j+1];
				int pos=0;
				while(actual.charAt(pos)==siguiente.charAt(pos)) {
					pos++;
				}
				if(actual.charAt(pos)>siguiente.charAt(pos)) {
					palabras[j] = siguiente;
					palabras[j+1]=actual;
				}
			}
		}
	}

}

