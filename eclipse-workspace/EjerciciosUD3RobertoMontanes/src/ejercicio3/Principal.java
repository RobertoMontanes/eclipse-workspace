package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 3. Hacer un programa que “imite” un cutre ticket de un McDonals que solo
		 * vende un tipo de hamburguesas, un tipo de patatas y un tipo de refrescos. Se
		 * debe pedir por teclado las cantidades de cada uno y el precio de una unidad y
		 * calcular el total de la venta, leer la cantidad entregada para pagar y el
		 * cambio. Los nombres de los productos deben ir en String, al inicializar las
		 * variables, al igual que el nombre del vendedor/a, fecha, etc. Quién lo
		 * atendió: Vuestro nombre Fecha: (usando un String, no el tipo fecha de java)
		 * Patatas medianas: Precio Bebida mediana: precio Hamburguesa Mc Royal: Precio
		 * Total a pagar: Suma de los 3 precios. Entregado: Cantidad entregada Cambio:
		 * Cambio a devolver Se deben usar las variables y operaciones adecuadas y
		 * guardar todos los datos intermedios en variables. 4. Cualquier cálculo de
		 * áreas, volúmenes, uso de fórmulas de física o matemáticas, etc.
		 */
		String nombre;
		String producto1;
		String producto2;
		String producto3;
		int cantidadProducto1;
		double precioProducto1;
		int cantidadProducto2;
		double precioProducto2;
		int cantidadProducto3;
		double precioProducto3;
		double SubtotalProducto1;
		double SubtotalProducto2;
		double SubtotalProducto3;
		double totalFinal;

		System.out.println("Hola, en este proyecto vamos a calcular precios "
				+ "y mostrar un ticket con toda la información pedida\n");
		System.out.println("Lo primero digame su nombre");
		nombre = Leer.dato();
		System.out.println("¿Qué hamburguesa quiere?");
		producto1 = Leer.dato();
		System.out.println("¿Cuántas hamburguesas " + producto1 + " quiere?");
		cantidadProducto1 = Leer.datoInt();
		System.out.println("¿Cuánto cuesta cada " + producto1 + "?");
		precioProducto1 = Leer.datoDouble();
		System.out.println("Vale, ahora las bebidas, dime que tamaño de bebida desea");
		producto2 = Leer.dato();
		System.out.println("Vale ha escogido el tamaño " + producto2 + ", ¿cuántas le gustaría comprar?");
		cantidadProducto2 = Leer.datoInt();
		System.out.println("Y por último digame el precio de cada bebida " + producto2);
		precioProducto2 = Leer.datoDouble();
		System.out.println("¿Qué más desea? (le recomiendo patatas)");
		producto3 = Leer.dato();
		System.out.println("¿Cuantas " + producto3 + " desea? ");
		cantidadProducto3 = Leer.datoInt();
		System.out.println("Cuánto cuesta cada porción de " + producto3 + " ?");
		precioProducto3 = Leer.datoDouble();

		SubtotalProducto1 = cantidadProducto1 * precioProducto1;
		SubtotalProducto2 = cantidadProducto2 * precioProducto2;
		SubtotalProducto3 = cantidadProducto3 * precioProducto3;
		totalFinal = SubtotalProducto1 + SubtotalProducto2 + SubtotalProducto3;
		System.out.println(
				"\n------------------------------------------------------------------------------------------------");
		System.out.println(nombre);
		System.out.println("Producto\t\tCantidad/U\t\tPrecio/U\t\tSubTotal");
		System.out.printf("\n%S\t\t%d\t\t\t%.2f\t\t\t%.2f", producto1, cantidadProducto1, precioProducto1,
				SubtotalProducto1);
		System.out.printf("\n%S\t\t\t%d\t\t\t%.2f\t\t\t%.2f", producto2, cantidadProducto2, precioProducto2,
				SubtotalProducto2);
		System.out.printf("\n%S\t\t\t%d\t\t\t%.2f\t\t\t%.2f", producto3, cantidadProducto3, precioProducto3,
				SubtotalProducto3);
		System.out.println(
				"\n------------------------------------------------------------------------------------------------");
		System.out.printf("Total a pagar: \t\t\t\t\t\t\t\t%.2f€", totalFinal);

	}

}
