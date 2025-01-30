package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// Declaración de variables al inicio
		Producto p1, p3, nuevoProducto;
		Producto[] productosIniciales;
		Tienda tienda;
		int opcion, id, nuevoId, seccion;
		double precio, porcentajePVP, porcentajeGanancias;
		String nombre, entradaFragil;
		boolean fragil;

		// Inicialización de productos y tienda
		p1 = new Producto(0, 1.20, "FANTA N", false, 1);
		p3 = new Producto(1, 85.99, "PANTALLA LG", true, 4);
		productosIniciales = new Producto[] { p1, p3, null, null, null }; // Espacio para más productos
		tienda = new Tienda(productosIniciales);

		do {
			// Encabezado decorativo
			System.out.println("╔════════════════════════════════════════════════════╗");
			System.out.println("║                  GESTIÓN DE TIENDA                 ║");
			System.out.println("╠════════════════════════════════════════════════════╣");
			System.out.println("║ 1. Listar todos los productos                      ║");
			System.out.println("║ 2. Comprobar si un producto es frágil              ║");
			System.out.println("║ 3. Añadir un producto                              ║");
			System.out.println("║ 4. Calcular inversión total                        ║");
			System.out.println("║ 5. Calcular PVP                                    ║");
			System.out.println("║ 6. Calcular ganancias                              ║");
			System.out.println("║ 0. Salir                                           ║");
			System.out.println("╚════════════════════════════════════════════════════╝");
			System.out.print("Seleccione una opción: ");
			opcion = Leer.datoInt();

			System.out.println("══════════════════════════════════════════════════════");

			switch (opcion) {
			case 1:
				System.out.println("▶ Listando todos los productos:");
				tienda.listarTodos();
				break;
			case 2:
				System.out.print("▶ Ingrese el ID del producto: ");
				id = Leer.datoInt();
				System.out.println("¿Es frágil? " + tienda.comprobarFragil(id));
				break;
			case 3:
				System.out.print("▶ Ingrese ID del nuevo producto: ");
				nuevoId = Leer.datoInt();
				System.out.print("Ingrese precio de fábrica: ");
				precio = Leer.datoDouble();
				System.out.print("Ingrese nombre del producto: ");
				nombre = Leer.dato();

				System.out.print("¿Es frágil? (true/false): ");
				entradaFragil = Leer.dato();
				fragil = entradaFragil.equalsIgnoreCase("true");

				System.out.print("Ingrese sección: ");
				seccion = Leer.datoInt();

				nuevoProducto = new Producto(nuevoId, precio, nombre, fragil, seccion);
				tienda.añadirProducto(nuevoProducto);
				break;
			case 4:
				System.out.println("▶ Inversión total: " + tienda.calcularInversionTotal());
				break;
			case 5:
				System.out.print("▶ Ingrese porcentaje de PVP: ");
				porcentajePVP = Leer.datoDouble();
				System.out.println("Precio de Venta al Público: " + tienda.calcularPVP(porcentajePVP));
				break;
			case 6:
				System.out.print("▶ Ingrese porcentaje de PVP: ");
				porcentajeGanancias = Leer.datoDouble();
				System.out.println("Ganancias: " + tienda.calcularGanancias(porcentajeGanancias));
				break;
			case 0:
				System.out.println("▶ Saliendo del programa... ¡Hasta luego!");
				break;
			default:
				System.out.println("❌ Opción no válida. Inténtelo de nuevo.");
			}

			System.out.println("══════════════════════════════════════════════════════");

		} while (opcion != 7);
	}
}
