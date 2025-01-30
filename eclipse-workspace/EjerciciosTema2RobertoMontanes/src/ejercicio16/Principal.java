package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 16. Leer una secuencia de 10 números y mostrar solo la suma y el producto de
		 * todos ellos.
		 */
		
		int suma;
		long producto;
		char respuesta;

		do {
		    suma = 0;
		    producto = 1; // Usamos long para evitar desbordamiento

		    System.out.println("Ingrese 10 números:");

		    for (int i = 0; i < 10; i++) {
		        System.out.print("Número " + (i + 1) + ": ");
		        int numero = Leer.datoInt();
		        suma += numero;
		        producto *= numero;
		    }

		    System.out.println("La suma de los números es: " + suma);
		    System.out.println("El producto de los números es: " + producto);

		    System.out.print("¿Desea realizar otra operación? (s/n): ");
		    respuesta = Leer.datoChar();
		} while (respuesta == 's' || respuesta == 'S');

			
	}

}
