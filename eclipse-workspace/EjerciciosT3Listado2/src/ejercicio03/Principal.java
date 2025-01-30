package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		double peso;
		double estatura;
		Cliente c;
		Gimnasio g = new Gimnasio(5);
		g.agregarClientes(new Cliente("65465465F", "Pablo", "Feo", true));
		g.agregarClientes(new Cliente("78252199N", "Roberto", "Guapo", false));
		
		System.out.println("Bienvenido a mi programa\n");
			
			
		do {
			System.out.println("\nElige una opcion");
			System.out.println("Pulsa 0. para salir");
			System.out.println("Pulsa 1. para calcular el imc del cliente");
			System.out.println("Pulsa 2. para mostrar lista");
			System.out.println("Pulsa ");

			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Dime su estatura (en metros)");
				estatura = Leer.datoDouble();
				System.out.println("Dime su peso (en kilogramos)");
				peso = Leer.datoDouble();
			//	System.out.println("Su IMC es: "+c.calcularIMC(peso, estatura));
				break;
			case 2:
				g.mostrarLista();
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:

				break;

			default:
				System.out.println("Número Inválido");
				break;
			}
			
		} while (opcion != 0);
		
	}

}
