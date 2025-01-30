package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Un trabajador necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga 16 euros por hora,
		 * si trabaja más de 40 horas se le paga 16 euros por cada una de las primeras
		 * 40 horas y 20 euros por cada hora extra. El programa deberá pedir al usuario
		 * el número de horas trabajadas por el obrero en total y mostrar el salario que
		 * le corresponde.
		 */
		
		 double numHorasTrabajadas;
	     double salario;
	        

	        System.out.println("Cuántas horas has trabajado?");
	        numHorasTrabajadas = Leer.datoDouble();

	        if (numHorasTrabajadas <= 40) {
	            salario = numHorasTrabajadas * 16; // Salario por horas normales
	        } else {
	            double horasExtra = numHorasTrabajadas - 40;
	            salario = (40 * 16) + (horasExtra * 20); // Salario por 40 horas + horas extra
	        }

	        System.out.printf("El salario correspondiente es: %.2f euros%n", salario);
	    }
	}