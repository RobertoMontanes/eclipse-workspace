package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Hacer un programa donde se declaren varias variables de distinto tipo, se lee
		 * por teclado un valor dado por el usuario y mostrar por la pantalla el valor
		 * con el formato adecuado (usando printf).
		 */

		double variable1;
		int variable2;
		String variable3;

		System.out.println("Hola, en este programa vamos a mostrar variables en pantalla");

		System.out.println("Dime un numero");
		variable1 = Leer.datoDouble();
		System.out.println("Dime un numero");
		variable2 = Leer.datoInt();
		System.out.println("Dime una palabra");
		variable3 = Leer.dato();
		
		System.out.println("Este es su primer número = "+variable1);
		System.out.println("Este es su segundo número = "+variable2);
		System.out.println("Esta es su primera palabra = "+variable3);

		System.out.println("\nEsto ha sido todo, muchas gracias");
	}

}
