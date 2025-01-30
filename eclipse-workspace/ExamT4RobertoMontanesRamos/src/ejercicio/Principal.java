package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		EntradaNormal en = new EntradaNormal(1, 2, 1);
		Famoso f = new Famoso(1, 2, 3, "Pepe");
		Grupo g = new Grupo(1, 2, 3, 15, f);
		Famoso f2 = new Famoso(2, 2, 3, "Roberto");
		Grupo g2 = new Grupo(2, 2, 3, 5, f2);
		Grupo g3 = new Grupo(1, 2, 3, 10, f2);
		int opcion = 0;
		int zonaAsiento = 0;
		EntradaNormal listaEntradas[] = {f, g, f2, g2, g3};		
		Taquilla t = new Taquilla(listaEntradas, en);
		
	System.out.println("Bienvenido a mi programa \n");
	System.out.println("Elige una opción\n");

	do {
		
		System.out.println("Pulsa 0. Para salir");
		System.out.println("Pulsa 1. buscar entradas por asientos");
		System.out.println("Pulsa 2. Calcular el total recaudado entre las entradas de grupo");
		System.out.println("Pulsa 3. Calcular el total recaudado entre las entradas de zona 2");
		System.out.println("Pulsa 4. Imprimir ticket de botella gratis para famosos");
		opcion = Leer.datoInt();
		
		
		switch (opcion) {
		case 0:
			System.out.println("Saliendo del programa...");
			break;
		case 1:
			t.buscarPorZonaAsiento();
			break;
		case 2:
			System.out.println("Se ha recaudado un total de" + t.recaudadoEntradasGrupo(zonaAsiento, 10));
			break;
		case 3:
			System.out.println("Total recaudado zona 2: " + t.recaudadoEntradasZona2(2, 0, 0) + "€");
			
			break;
		case 4:
			System.out.println();
			f.imprimirRegaloEntradaFamoso();
			System.out.println();
			break;
		case 5:
			System.out.println(en.calcularIVA(21, zonaAsiento, zonaAsiento, opcion));
			
			break;

		default:
			System.out.println("Número Inválido. Pruebe otro");
			break;
		}
	} while (opcion!=0);
	
	
	System.out.println("\nMuchas gracias por usar mi programa");
	
	}

}
