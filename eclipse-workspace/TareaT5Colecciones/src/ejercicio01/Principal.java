package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GestionNotas gn = new GestionNotas();
		int opcion;

		do {
			System.out.println("\n--- Gestión de Notas ---");
			System.out.println("1. Agregar una nueva nota");
			System.out.println("2. Mostrar todas las notas");
			System.out.println("3. Mostrar una nota individual");
			System.out.println("4. Borrar una nota");
			System.out.println("5. Mostrar número de notas");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");

			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea

			switch (opcion) {
			case 1:
				System.out.print("Ingrese el título de la nota: ");
				String titulo = scanner.nextLine();
				System.out.print("Ingrese el contenido de la nota: ");
				String contenido = scanner.nextLine();
				gn.agregarNota(titulo, contenido);
				break;

			case 2:
				gn.mostrarNotas();
				break;

			case 3:
				System.out.print("Ingrese el número de la nota a mostrar: ");
				int indiceMostrar = scanner.nextInt() - 1;
				gn.mostrarNotaIndividual(indiceMostrar);
				break;

			case 4:
				System.out.print("Ingrese el número de la nota a borrar: ");
				int indiceBorrar = scanner.nextInt() - 1;
				gn.borrarNota(indiceBorrar);
				break;

			case 5:
				gn.numeroDeNotas();
				break;

			case 6:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}

		} while (opcion != 6);

		scanner.close();

	}

}
