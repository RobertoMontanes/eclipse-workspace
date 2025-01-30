package ejercicio09v2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		Sorteo s = new Sorteo(); // Crear instancia del sorteo
		int numeroPorTeclado;
		System.out.println("Bienvenido a mi programa");

		do {
			System.out.println("\nPulse 0. para salir del programa");
			System.out.println("Pulse 1. para Comprar el décimo que quieras");
			System.out.println("Pulse 2. para comprar un décimo aleatorio");
			System.out.println("Pulse 3. para Hacer un sorteo");
			System.out.println("Pulse 4. para Comprobar si nuestro décimo está premiado");
			System.out.println("Pulse 5. para Mostrar si eres ganador o no");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 0:
					System.out.println("Saliendo...\n");
					break;

				case 1:
					System.out.println("Diga el número que quiere comprar (entre 00001 y 99999):");
					numeroPorTeclado = Leer.datoInt();
					System.out.println("Ha comprado el número: " + s.getNumeroBoletoElegido());
					
					break;

				case 2:
					int numeroAleatorio = s.GenerarNumeroAleatorio();
					s.setNumeroBoletoElegido(numeroAleatorio);
					System.out.println("Ha comprado el número aleatorio: " + numeroAleatorio);
					break;

				case 3:
					s.GenerarNumeroPremiado();
					System.out.println("¡El sorteo se ha realizado! El número premiado es: " + s.getNumeroPremiado());
					break;

				case 4:
					if (s.getNumeroBoletoElegido() == 0 || s.getNumeroPremiado() == 0) {
						System.out.println("Primero debe comprar un décimo y realizar el sorteo.");
					} else {
						boolean estaPremiado = s.comprobarPremio();
						System.out.println("¿Está premiado su décimo? " + (estaPremiado ? "Sí" : "No"));
					}
					break;

				case 5:
					if (s.getNumeroBoletoElegido() == 0 || s.getNumeroPremiado() == 0) {
						System.out.println("Primero debe comprar un décimo y realizar el sorteo.");
					} else {
						System.out.println(s.Ganar());
					}
					break;

				default:
					System.out.println("Número inválido. Inténtelo de nuevo.");
					break;
			}

		} while (opcion != 0);

		System.out.println("Gracias por usar mi programa.");
	}
}
