package ejercicio;

import java.util.Random;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int clases[];
		int tam;
		int opcion;
		int min;
		int max;
		int numeroclases;
		int contador;
		int cantidad;
		Random num = new Random(System.nanoTime());
		int suma;
		double media = 0.00;
		double porcentaje;
		int sumaDonacion;
		int maxDonacion;
		int claseMaxima;

		System.out.println("Bienvenido a mi programa");
		System.out.println("Dime cuántas clases hay");
		tam = Leer.datoInt();
		clases = new int[tam];

		System.out.println("Dime el mínimo de donación de clase");
		min = Leer.datoInt();
		System.out.println("Dime el máximo de donación de clase");
		max = Leer.datoInt();

		do {
			System.out.println("\nEliga una opción");
			System.out.println("Pulse 0 para salir del programa");
			System.out.println("Pulse 1 para ver las donaciones de las clases");
			System.out.println("Pulse 2 para mostrar las donaciones generadas");
			System.out.println("Pulse 3 para contar clases con donaciones mayores a una cantidad dada");
			System.out.println("Pulse 4 para calcular y mostrar la media de las donaciones");
			System.out.println("Pulse 5 para mostrar todos los datos de forma adecuada");
			System.out.println("Pulse 6 para sumar a una clase elegida una cantidad leída por teclado");
			System.out.println("Pulse 7 para calcular el porcentaje de euros recaudado por una clase");
			System.out.println("Pulse 8 para mostrar la clase que más dinero ha recaudado");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				for (int i = 0; i < clases.length; i++) {
					clases[i] = num.nextInt(max - min + 1) + min;
					System.out.println("Donación de clase " + (i + 1) + ": " + clases[i]);
				}
				break;
			case 2:
				System.out.println("¿Qué clase quieres ver? (1 a " + clases.length + ")");
				numeroclases = Leer.datoInt();
					System.out.println("Donación de clase " + numeroclases + ": " + clases[numeroclases - 1]);
				
				break;
			case 3:
				System.out.println("Dime la cantidad a comparar");
				cantidad = Leer.datoInt();
				contador = 0;
				for (int donacion : clases) {
					if (donacion > cantidad) {
						contador++;
					}
				}
				System.out.println("Número de clases con donaciones mayores a " + cantidad + ": " + contador);
				break;
			case 4:
				suma = 0;
				for (int i = 0; i < clases.length; i++) {
					suma = suma + clases[i];	
				}
				media = (double)suma / clases.length;
				
				System.out.printf("La media de las donaciones es: %.2f€\n", media);

				
				break;
			case 5:
				System.out.printf("Clase \t Cantidad (€)\n");
				for (int i = 0; i < clases.length; i++) {
					System.out.println("  "+(i + 1)+"\t     "+ clases[i]);
				}
				break;
			case 6:
				System.out.println("¿Qué clase quieres modificar? (1 a " + clases.length + ")");
				numeroclases = Leer.datoInt();
					System.out.println("¿Cuánto deseas sumar a la donación?");
					sumaDonacion = Leer.datoInt();
					clases[numeroclases - 1] += sumaDonacion;
					System.out.println("Nueva donación de clase " + numeroclases + ": " + clases[numeroclases - 1]);
				
				break;
			case 7:
				System.out.println("¿Qué clase quieres analizar? (1 a " + clases.length + ")");
				numeroclases = Leer.datoInt();
				if (numeroclases >= 1 && numeroclases <= clases.length) {
					porcentaje =  (double)clases[numeroclases - 1] / 90 * 100;
					System.out.printf("La clase %d ha recaudado un %.2f%% de la media de otros años.\n", numeroclases, porcentaje);
				} else {
					System.out.println("Número de clase no válido, intenta de nuevo.");
				}
				break;
			case 8:
				 maxDonacion = clases[0];					 				
				 claseMaxima = 1;
				for (int i = 1; i < clases.length; i++) {
					if (clases[i] > maxDonacion) {
						maxDonacion = clases[i];
						claseMaxima = i + 1;
					}
				}
				
				System.out.println("La clase que más dinero ha recaudado es la clase " + claseMaxima + " con "
						+ maxDonacion + "€.");
				break;
			default:
				System.out.println("Opción no válida, intenta de nuevo.");
				break;
			}
		} while (opcion != 0);

		System.out.println("Gracias por usar mi programa.");
	}
}
