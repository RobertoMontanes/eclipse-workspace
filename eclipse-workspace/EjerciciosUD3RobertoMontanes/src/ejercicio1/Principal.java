 package ejercicio1;

import utilidades.*;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 1. El precio final de venta de un automóvil nuevo para un comprador es la
		 * suma total de: el coste de fabricación del vehículo, el porcentaje de la
		 * ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de
		 * fabricación). Pedir por teclado la ganancia del vendedor que se quiere en
		 * porcentaje en cada coche, el % de impuesto y el coste de fabricación y
		 * diseñar un programa para calcular el precio final de un automóvil e
		 * imprimirlo por pantalla
		 */

		double precioFinal, 
		costeFabricacion, 
		porcentajeGanaciaVendedor, 
		impuestosEstatales, 
		costeFabricacionImpuesto,
		costeFabricacionPorcentajeGananciaVendedor, 
		cien = 100;

		System.out.println("Hola, en este programa vamos a ver " + "como calcular el precio final de un automóvil");
		System.out.println("Cuál es la ganancia del vendedor por cada coche (%)");
		porcentajeGanaciaVendedor = Leer.datoDouble();

		System.out.println("Cuál es el porcentaje de impuestos estatales que paga (%)");
		impuestosEstatales = Leer.datoDouble();

		System.out.println("Cuál es el coste de fabricación (€)");
		costeFabricacion = Leer.datoDouble();

		costeFabricacionImpuesto = (costeFabricacion * impuestosEstatales) / cien;
		costeFabricacionPorcentajeGananciaVendedor = (costeFabricacion * porcentajeGanaciaVendedor) / cien;
		precioFinal = costeFabricacion + costeFabricacionImpuesto + costeFabricacionPorcentajeGananciaVendedor;
		System.out.printf("\nCoste por impuestos estatales\t\t%.2f€", costeFabricacionImpuesto);
		System.out.printf("\nCoste por Fabricación\t\t\t%.2f€", costeFabricacion);
		System.out.printf("\nCoste por Ganancia del vendedor\t\t%.2f€", costeFabricacionPorcentajeGananciaVendedor);
		System.out.println("\n--------------------------------------------------");
		System.out.printf("Coste Total \t\t\t\t%.2f€", precioFinal);
		System.out.println("\n\nEste ha sido todo el programa, muchas gracias");	}

}



