package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Realizar un programa para calcular y mostrar por pantalla el sueldo de un
		 * trabajador. Se deben pedir todos los datos necesarios por teclado. El sueldo
		 * se calcula multiplicando las horas trabajadas por el precio de la hora
		 * "normal" más las horas extras por el precio al que se paga una hora extra
		 * (mayor que una normal).
		 */
		
		//Debería poner la segunda palabra de las variables con la segunda palabra en mayúscula
		
		double horastrabajadas;
		double preciohora;
		double horasextras;
		double preciohoraextra;
		double sueldo;
		double horaextrafinal;
		
		System.out.println("Hola, en este programa vamos a mostrar en pantalla tu sueldo");
		System.out.println("¿Cuántas horas has trabajado?");//Deberías especificar sin horas extra tio
		horastrabajadas = Leer.datoDouble();
		System.out.println("¿Cuánto cobras por hora trabajada normal?");
		preciohora = Leer.datoDouble();
		System.out.println("¿Cuántas horas extras has hechado?");
		horasextras = Leer.datoDouble();
		System.out.println("¿Cuánto ganas por hora extra?");
		preciohoraextra = Leer.datoDouble();
		
		horaextrafinal = horasextras*preciohoraextra;
		sueldo = (horastrabajadas*preciohora)+horaextrafinal;
		
		System.out.printf("Tú sueldo es de: %.2f€", sueldo);
		
		System.out.println("\n\n------------------------------------------------------");
		System.out.printf("\nHoras trabajadas\t\t%.2f€\t\tValor hora trabajada\t\t %.2f€/h", horastrabajadas, preciohora);
		System.out.printf("\nHoras extra trabajadas\t\t%.2f€\t\tValor hora extra trabajada\t %.2f€/h", horasextras, preciohoraextra);
		System.out.printf("\nEn total su sueldo es de \t%.2f€", sueldo);
		
		
		System.out.println("\nEso es todo, muchas gracias, hasta luego");
		/*(Yo)
		 * Variable 7/10 (mal escritas)
		 * Operaciones 10/10
		 * Impresiones 10/10
		 *|--------------------------------|
		 *|--------------------------------| 
		 *Pedro Serrano
		 * Variables 9/10
		 * Operaciones 10/10
		 * Impresiones 8/10
		 * */
	}

}
