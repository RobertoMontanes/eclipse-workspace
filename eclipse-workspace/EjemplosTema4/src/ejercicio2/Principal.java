package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Documento d = new Documento("Viñafiel", 124, 1200);
		TarjetaVisita t = new TarjetaVisita("VIñalicor", 130, 8000, 672367292, "Roberto", "Olivares", 1500);
		Carta c = new Carta("Viñalba", 10, 1300, 2024);
		int opcion;

		System.out.println("Bienvenido a mi programa");

		do {

			System.out.println("Pulsa 0. para salir del programa");
			System.out.println("Pulsa 1. para ver documento básico");
			System.out.println("Pulsa 2. para ver tarjeta de visita");
			System.out.println("Pulsa 3. para ver una carta");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
					System.out.println("Salir del programa");
					break;
				case 1:
					d.imprimirCarta();
					System.out.println();
					break;
				case 2:
					t.imprimirCarta();
					System.out.println();
					break;
				case 3:
					c.imprimirCarta();
					System.out.println();
					break;
				default:
					System.out.println("Número Inválido");
					break;
			}
		} while (opcion != 0);
		System.out.println("El programa ha finalizado");
	}

}
