package ejercicio02_listado2;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		int opcion;
		int capacidad = 5;
		Hotel hotel = new Hotel(capacidad);

		do {

			System.out.println("\n--- Menú del Minihotel ---");
			System.out.println("Pulsa 0. para salir");
			System.out.println("Pulsa 1. para agregar una habitación");
			System.out.println("Pulsa 2. para mostrar todas las habitaciones");
			System.out.println("Pulsa 3. para mostrar habitaciones disponibles");
			System.out.println("Pulsa 4. para asignar cliente a una habitación");
			System.out.println("Pulsa 5. para generar factura de una habitación");
			System.out.print("Elige una opción: ");

			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				System.out.print("Introduce el tipo de habitación: ");
				String tipo = Leer.dato();
				System.out.print("Introduce el precio base: ");
				double precioBase = Leer.datoDouble();
				System.out.print("Introduce los servicios extra (separados por comas): ");
				String serviciosExtra = Leer.dato();

				Habitacion nuevaHabitacion = new Habitacion(tipo, precioBase, serviciosExtra);
				hotel.agregarHabitacion(nuevaHabitacion);
				System.out.println("Habitación agregada correctamente.");
				break;

			case 2:

				System.out.println("Lista de todas las habitaciones:");
				hotel.mostrarHabitaciones();
				break;

			case 3:

				System.out.println("Habitaciones disponibles:");
				hotel.mostrarHabitacionesDisponibles();
				break;

			case 4:

				System.out.print("Introduce el número de la habitación (0 a N): ");
				int numeroHabitacion = Leer.datoInt();
				if (numeroHabitacion >= 0 && numeroHabitacion < hotel.getHabitaciones().length) {
					Habitacion habitacion = hotel.getHabitaciones()[numeroHabitacion];
					if (!habitacion.isOcupada()) {
						System.out.print("Introduce el nombre del cliente: ");
						String cliente = Leer.dato();
						System.out.print("Introduce el número de días contratados: ");
						int dias = Leer.datoInt();

						habitacion.asignarCliente(cliente, dias);
						System.out.println("Cliente asignado correctamente.");
					} else {
						System.out.println("La habitación ya está ocupada.");
					}
				} else {
					System.out.println("Número de habitación inválido.");
				}
				break;

			case 5:
				// Generar factura de una habitación
				System.out.print("Introduce el número de la habitación (0 a N): ");
				int numFactura = Leer.datoInt();
				if (numFactura >= 0 && numFactura < hotel.getHabitaciones().length) {
					Habitacion habitacion = hotel.getHabitaciones()[numFactura];
					if (habitacion.isOcupada()) {
						System.out.println("Factura:");
						System.out.println(habitacion.generarFactura());
					} else {
						System.out.println("La habitación está vacía.");
					}
				} else {
					System.out.println("Número de habitación inválido.");
				}
				break;

			case 0:
				// Salir del programa
				System.out.println("Saliendo del sistema. ¡Hasta luego!");
				break;

			default:
				// Opción inválida
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		} while (opcion != 0); // Terminar el bucle si el usuario pulsa 0
	}
}
