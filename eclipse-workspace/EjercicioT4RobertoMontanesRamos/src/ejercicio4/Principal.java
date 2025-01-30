package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Producto leche = new Alimentacion(1.20, 101, "Leche", 1, true);
		Producto pan = new Alimentacion(0.80, 102, "Pan", 3, false);
		Producto smartphone = new Electronica(300.00, 201, "Smartphone", true);

		Venta venta = new Venta(3);

		int opcion = 0;

		do {

			System.out.println("\n----- MENÚ DE OPCIONES -----");
			System.out.println("1. Agregar producto a la venta");
			System.out.println("2. Imprimir ticket");
			System.out.println("3. Listar productos");
			System.out.println("4. Salir");
			System.out.print("Selecciona una opción: ");

			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					System.out.println("\nSelecciona el producto a agregar:");
					System.out.println("1. Leche");
					System.out.println("2. Pan");
					System.out.println("3. Smartphone");
	
					int productoSeleccionado = Leer.datoInt();
					System.out.print("Cantidad: ");
					int cantidad = Leer.datoInt();
	
					switch (productoSeleccionado) {
					case 0:
						System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
						break;
					case 1:
						venta.agregarLineaVenta(new LineaVenta(leche, cantidad));
						System.out.println("Producto 'Leche' agregado.");
						break;
					case 2:
						venta.agregarLineaVenta(new LineaVenta(pan, cantidad));
						System.out.println("Producto 'Pan' agregado.");
						break;
					case 3:
						venta.agregarLineaVenta(new LineaVenta(smartphone, cantidad));
						System.out.println("Producto 'Smartphone' agregado.");
						break;
					default:
						System.out.println("Opción inválida.");
					}
					break;
	
				case 2:
					venta.imprimirTicket();
					break;
	
				case 3:
					venta.listarProductos();
					break;
	
				default:
					System.out.println("Opción inválida. Intenta de nuevo.");
					break;
			}

		} while (opcion != 0);

	}
}
