package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

	
		double dineroPedido;
		double numeroAñosPagando;
		String nombre;
		String apellidos;
		double interes = 3.5;
		double cuotasAnual = 12;
		double cantidadMensual;
		double cuotaFinal;
		
		System.out.println("Hola, en este programa vamos a ver cuánto pagaría al mes de hipoteca");
		
		System.out.println("¿Cuánto dinero quiere pedir al banco? (€)");
		dineroPedido = Leer.datoDouble();
		
		System.out.println("¿Cuántos años quiere estar pagando? (Año)");
		numeroAñosPagando = Leer.datoDouble();
		
		System.out.println("Dime su nombre, por favor");
		nombre = Leer.dato();
		
		System.out.println("Dime sus apellidos");
		apellidos = Leer.dato();
		
		cuotaFinal = numeroAñosPagando * cuotasAnual;
		
		cantidadMensual = (dineroPedido * interes) / (cuotaFinal* 2);
		
		System.out.printf("La cantidad que tienes que pagar mensualmente es de %.2f€",cantidadMensual);
		
		System.out.println("\n\nCAIXABANK\n------------------------------------------------------------");
		System.out.printf("Nombre: \t%S",nombre);
		System.out.printf("\nApellidos: \t%S",apellidos);
		System.out.printf("\n\nDinero Total Pedido:\t %.2f€",dineroPedido);
		System.out.printf("\nAños Pagando:\t\t %.2f Años",numeroAñosPagando);
		System.out.printf("\nTasa de Interés:\t %.2f%%",interes);
		System.out.printf("\nTotal Mensual: \t\t %.2f€", cantidadMensual);
		
		System.out.printf("\n\nTiene que pagar %.2f€ al mes, durante %.2f años con"
				+ " un\ninterés del %.2f%% para poder devolver el dinero pedido.",cantidadMensual, numeroAñosPagando,interes);
		System.out.println("\n\n------------------------------------------------------------");
		
		System.out.println("\n\n\nMuchas gracias, aquí acaba mi programa.");
	}	

}
