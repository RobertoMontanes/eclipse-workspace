package ejercicio;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;
		boolean ocupada = false;
		List<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();

		listaHabitaciones.add(new Habitacion(1, "Roberto", false, 100));
		listaHabitaciones.add(new Habitacion(3, "Mario", false, 300));
		listaHabitaciones.add(new Habitacion(2, "Juan", true, 200));
		listaHabitaciones.add(new Habitacion(4, "Pedro", true, 400));

		Hotel hotel = new Hotel(listaHabitaciones);

		System.out.println("Bienvenido a mi programa \n");

		do {
			System.out.println("\nElige una opción");
			System.out.println("Pulsa 0. para salir");
			System.out.println("Pulsa 1. para agregar una habitación");
			System.out.println("Pulsa 2. para borrar una habitación");
			System.out.println("Pulsa 3. para modificar su estado de ocupación");
			System.out.println("Pulsa 4. para mostrar habitaciones");
			System.out.println("Pulsa 5. para buscar habitaciones ocupadas");
			System.out.println("Pulsa 6. para buscar habitación por número");
			System.out.println("Pulsa 7. para calcular recaudación entre las habitaciones ocupadas");
			System.out.println("Pulsa 8. para imprimir pocas habitaciones");
			System.out.println("Pulsa 9. para ordenar por número de Habitación");
			System.out.println("Pulsa 10. para ordenar por precio");

			opcion = Integer.parseInt(scanner.nextLine());

			switch (opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					System.out.println("Dime el número de habitación");
					int numeroCrearHabitacion = Integer.parseInt(scanner.nextLine());
	
					System.out.println("Dime el nombre del cliente");
					String NombreCrearCliente = scanner.nextLine();
					System.out.println("¿Está ocupada? pulsa 1. para sí u otro número para no");
					int ocupadaCrear = Integer.parseInt(scanner.nextLine());
					if (ocupadaCrear == 1) {
						ocupada = true;
					} else {
						ocupada = false;
					}
	
					System.out.println("Dime el precio básico de habitación");
					double precioBasicoCrearHabitacion = Double.parseDouble(scanner.nextLine());
	
					hotel.agregarHabitacion(new Habitacion(numeroCrearHabitacion, NombreCrearCliente, ocupada,
							precioBasicoCrearHabitacion));
					break;
				case 2:
					System.out.println("Dime el número de habitación a borrar");
					int numeroBorrarHabitacion = Integer.parseInt(scanner.nextLine());
	
					hotel.borrarHabitacion(numeroBorrarHabitacion);
					break;
				case 3:
					System.out.println("Dime el número de una habitación " + "para modificar su estado de ocupación");
					int numeroModificarHabitacion = Integer.parseInt(scanner.nextLine());
					hotel.modificarOcupacionHabitacion(numeroModificarHabitacion);
	
					break;
				case 4:
					hotel.mostrarHabitaciones();
					break;
				case 5:
					hotel.mostrarHabitacionesOcupadas();
					break;
				case 6:
					System.out.println("Dime el número de habitación para buscarla");
					int numeroBuscarHabitacion = Integer.parseInt(scanner.nextLine());
					hotel.buscarHabitacionPorNumero(numeroBuscarHabitacion);
					break;
				case 7:
					System.out.printf("La suma total recaudada es: " + hotel.calcularDineroRecaudado() + "€ \n");
					break;
				case 8:
	
					break;
				case 9:
					System.out.println("Sus habitaciones ya están ordenadas por número: \n");
					Collections.sort(listaHabitaciones);
					for (Habitacion habitacion : listaHabitaciones) {
						System.out.println(habitacion);
					}
					break;
				case 10:
					System.out.println("Sus habitaciones ya están ordenadas por precio: \n");
					Collections.sort(listaHabitaciones, new OrdenarPorPrecio());
					for (Habitacion habitacion : listaHabitaciones) {
						System.out.println(habitacion);
					}
					break;
	
				default:
					System.out.println("Número Inválido");
					break;
			}

		} while (opcion != 0);

		System.out.println("Gracias por usar mi programa");

		scanner.close();

	}

}
