package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		Magdalena m1, m2, m3;
		Magdalena lista[];
		Pasteleria p = new Pasteleria(5);
		m1 = new Magdalena(1, "Lima", false, 5);
		m2 = new Magdalena(1, "Fresa", false, 12.50);
		m3 = new Magdalena(2, "Chocolate", true, 8);
		int id;
		String sabor;
		boolean cupcake;
		double volumenMasa;
		
		
		
		System.out.println("Bienvenido a mi programa\n");
		
		do {
			
			System.out.println("Elige una opción\n");
			System.out.println("Pulsa 0. para salir");
			System.out.println("Pulsa 1. para agregar una magdalena a la lista por teclado");
			System.out.println("Pulsa 2. para buscar y devolver todas las magdalenas de un sabor pasado como parámetro");
			System.out.println("Pulsa 3. para buscar una magdalena por id devolviendo lo que considere más oportuno");
			System.out.println("Pulsa 4. para calcular la media de centímetros cúbicos que gasta todas las magdalenas del array");
			System.out.println("Pulsa 5. para calcular el precio de coste");
			System.out.println("Pulsa 6. para mostrar la lista de cupcakes");
			System.out.println("Pulsa 7. para calcular el porcentaje de presupuesto gastado en magdalenas");
			System.out.println("Pulsa 8. para calcular lo que cuesta hacer todas las magdalenas normales");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Dime su id");
				id = Leer.datoInt();
				System.out.println("Dime su sabor (Fresa, Chocolate o Lima)");
				sabor = Leer.dato();
				System.out.println("Dime el volumen de su masa (centímetros cúbicos)");
				volumenMasa = Leer.datoDouble();
				p.agregarMagdalena(m3);
				break;
			case 2:
				p.mostrarLista();
				
				break;
			case 3:
				System.out.println("Diga el sabor de magdalena que desea buscar (Fresa, Chocolate o lima)");
				sabor = Leer.dato();
				p.buscarPorSabor(sabor);
				break;
			case 4:
				System.out.println("Diga el id de la magdalena que desea buscar");
				id = Leer.datoInt();
				p.buscarPorId(id);
				break;
			case 5:
				System.out.println("La media de Centímetros cúbicos es: " );
				break;
			case 6:
				System.out.println("Precio coste");
				break;
			case 7:
				System.out.println("Lista de cupcakes: ");
				break;
			case 8:
				
				break;
			case 9:
				
				break;

			default:
				System.out.println("Número inválido, pruebe otro\n");
				break;
			}
		} while (opcion != 0);
		
	}

}
