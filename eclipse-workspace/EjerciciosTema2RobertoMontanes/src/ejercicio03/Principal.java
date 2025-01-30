package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		System.out.print("Ingrese un número: ");
		int numero = Leer.datoInt();

		if (numero % 2 == 0) {
		    System.out.println("El número " + numero + " es par.");
		} else {
		    System.out.println("El número " + numero + " es impar.");
		}

			
	}

}
