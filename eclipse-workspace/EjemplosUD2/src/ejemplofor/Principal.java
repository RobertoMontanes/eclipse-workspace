package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int tope = 0;
		
		System.out.println("dime cuantas veces quiere repetir el saludo");
		tope = Leer.datoInt();
		
		for (int i = 0; i < tope; i++) {
			System.out.println((i+1)+" hola");		
		}
	}
}