package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int contador = 0;
		int tope;
		
		System.out.println("Dime cuántas veces quieres repetir la palabra");
		tope = Leer.datoInt();
		
		while (contador<tope) {
			
			System.out.println("Lucía");
			
			contador++;
			
		}
		System.out.println("Bye");
	}

}
