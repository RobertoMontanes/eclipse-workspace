package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Leer dos números tipo double. Vamos a dividir el primero entre el segundo y
		 * se debe mostrar un mensaje de error si el segundo es cero ANTES de hacer la
		 * operación. Si se puede hacer, mostrar el resultado con dos decimales.
		 */
			double numerador;
			double denominador;
			double division;
			String numerador1 = "numerador";
			String denominador1 = "denominador";

			System.out.println("Hola en este programa vamos a dividir dos numeros");
			
			System.out.println("Dime el valor del "+numerador1);
			numerador = Leer.datoDouble();
			System.out.println("Dime el valor del "+denominador1);
			denominador = Leer.datoDouble();
			
			
			if (denominador==0) {
				System.out.println("Error");
				
			}else {
				division = numerador/denominador;
				System.out.printf("El resultado es %.2f",division);
			}
			
			System.out.println("\nMuchas gracias por usar mi código, hasta luego");

	}

}
