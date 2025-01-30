package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * . ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta
		 * pago de mantenimiento un 1 % del saldo con la que la abrí inicialmente al año
		 * y tengo unos intereses del 3 % del saldo inicial? Hacer un programa que
		 * calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial
		 * con el que se quiere abrir la cuenta
		 */
		//Mal
		double saldoInicial;
		int mantenimiento = 1;
		int interes = 3;
		double mantenimientoResta;
		double mantenimientoTotal;
		double interesResta;
		double interesTotal;
		double totalRestando;
		double totalFinal;
		
		System.out.println("Hola, en este programa vamos a ver tu saldo dedspués de un pago de mantenimiento y un interés");
		
		System.out.println("¿Cuál será su saldo inicial?");
		saldoInicial = Leer.datoDouble();
		
		mantenimientoResta = saldoInicial-(saldoInicial*mantenimiento)/100;
		mantenimientoTotal = mantenimientoResta-mantenimiento;
		
		System.out.println("A su saldo se le aplica el 1% por pago por mantenimiento"
				+ ", es decir, \n\t"+saldoInicial+"€ - "+mantenimientoResta+"€ = "+mantenimientoTotal+"€");
		
		interesResta = saldoInicial+(saldoInicial*interes)/100;
		interesTotal = interesResta-interes;
		System.out.println("También aplicamos el 3% de interés a tu saldo inicial"
				+ "\n\t"+interesResta+"€ + "+saldoInicial+"€ = "+interesTotal+"€");
		totalRestando = interesTotal-mantenimientoTotal;
		totalFinal = saldoInicial-totalRestando;
		System.out.println("\nTotal: "+totalFinal+"€");
		
	
	
	}

}
