package ejemplos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int edad;
		int mayoria = 18;
		double saldo;
		double tope = 100;
		
		
		System.out.println("Dime tu edad");
		edad = Leer.datoInt();
		System.out.println("Dime tu saldo");
		saldo = Leer.datoDouble();
		if (edad>=mayoria||saldo>=tope) { // && = AND  ;  || = OR
			System.out.println("Entras en Occo");
			
		}else {System.out.println("No puedes pasarrrr");
			
		}
		System.out.println("Adiós");
	}

}
