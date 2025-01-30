package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int dias = 10;
		double precioCaravanaDia;
		double precioConexionDia;
		double precioPersona = 2; //Él y su mujer
		double bar = 182.50;
		double IVA = 21;
		double costeCaravanaTotal;
		double costeConexionTotal;
		double costePersonaTotal;
		String caravana = "caravana";
		String conexion = "conexión";
		String persona = "persona";
		String palabraBar = "bar";
		double subtotalTotal;
		double subtotalTotalIVA;
		int cien = 100;
		double sumaIVA;
		double pago;
		double cambio;
		double descuento;
		double descuentoFinal;
		double PagoFinal;
		
		System.out.println("Hola, en este programa vamos a calcular el precio final de una estancia");

		
		System.out.println("¿Cuánto costaba la caravana al día? (€)");
		precioCaravanaDia = Leer.datoDouble();
		
		System.out.println("¿Cuánto costaba el precio de la conexion al día? (€)");
		precioConexionDia = Leer.datoDouble();
		
		System.out.println("¿Cuánto cuesta cada persona al día? (€)");
		precioPersona = Leer.datoDouble();
		
		
		costeCaravanaTotal = precioCaravanaDia * dias;
		
		System.out.printf("En %d días con la caravana, me he gastado %.2f€", dias, costeCaravanaTotal);
		
		costeConexionTotal = precioConexionDia * dias; 
		
		System.out.printf("\nEn %d días con la conexión, me he gastado %.2f€", dias, costeConexionTotal);
		
		System.out.printf("\nEn el bar me he gastado %.2f€", bar);
		
		costePersonaTotal = precioPersona * dias;
		
		System.out.printf("\nMe gasté %.2f€ en personas que se quedaban", costePersonaTotal);
		
		System.out.printf("\nY a todo el conjunto de gastos, hay que hacerle el %.2f%% de IVA",IVA);

		subtotalTotal = costeCaravanaTotal+costeConexionTotal+costePersonaTotal+bar;
		subtotalTotalIVA = subtotalTotal * (IVA/cien); 
		sumaIVA = subtotalTotal + subtotalTotalIVA;
				
		System.out.println("\n\n\nTICKET\n----------------------------------------------------------------------");
		System.out.println("Concepto\tPrecio/Dia\tCantidad/Concepto\tSubTotal\n");
		System.out.printf("%S\t%.2f€\t\t%d Días\t\t\t%.2f€",caravana ,precioCaravanaDia, dias, costeCaravanaTotal);
		System.out.printf("\n%S\t%.2f€\t\t%d Días\t\t\t%.2f€",conexion ,precioConexionDia, dias, costeConexionTotal);
		System.out.printf("\n%S\t\t%.2f€\t\t%d Días\t\t\t%.2f€",persona, precioPersona, dias, costePersonaTotal);
		System.out.printf("\n%S\t\t%.2f€\t\t\t\t\t%.2f€",palabraBar, bar, bar);
		System.out.printf("\n\nPrecio Total sin IVA\t\t\t\t\t%.2f€", subtotalTotal);
		System.out.printf("\nTotal Pagado por IVA\t\t\t\t\t%.2f€", subtotalTotalIVA);
		System.out.printf("\nPrecio IVA\t\t\t\t\t\t%.2f€",sumaIVA);

		
		System.out.println("\n\n¿Cuánto dinero va a dar? (€)");
		pago = Leer.datoDouble();
		
		cambio = pago - sumaIVA;
		
		System.out.printf("Le tengo que devolver %.2f€",cambio);
		
		System.out.println("\n\n----------------------------------------------------------------------");
		
		System.out.println("\nDime el descuento que desea aplicar");
		descuento = Leer.datoDouble();
		
		descuentoFinal = sumaIVA*(descuento/100);
		PagoFinal = sumaIVA - descuentoFinal;
		System.out.printf("Gracias al descuento 'Programador en Paro', el coste final es de %.2f€",PagoFinal);
		
		
		System.out.println("\n\n\nHasta aquí termina mi programa, muchas gracias");
	}

}
