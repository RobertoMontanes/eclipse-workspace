package ejemplomenucompleto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		
		int numeroSeleccionado = 0;

		System.out.println("Hola, ejemplo de menú completo");
		System.out.println("Introduzca un número según opción deseada");
	
		do {
			System.out.println("0. Para salir");
			System.out.println("1. Refranes");
			System.out.println("2. Títulos de canciones");
			System.out.println("3. Frases hechas");
			numeroSeleccionado = Leer.datoInt();
			
			switch (numeroSeleccionado) {
			case 0:
				System.out.println("\nSaliendo....\n");
				break;

			case 1:
				System.out.println("\nEn abril aguas mil\n");
				break;
			
			case 2:
				System.out.println("\nAgila\n");
				break;
			
			case 3:
				System.out.println("\nNo ni na\n");
				break;
				default:
					System.out.println("\nOpción incorrecta\n");
				break;
			}
			
			
		} while (numeroSeleccionado!=0);
	
		System.out.println("Gracias por usar el programa");
	
	
	
	
	}

}
