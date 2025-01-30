package ejercicio20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 0. Haga un programa de la interfaz de un cajero automático. Tendrá las
		 * opciones, ver saldo, retirar dinero, comprar entradas e ingresar dinero. En
		 * cada opción se pedirán los datos necesarios y se realizarán las operaciones
		 * adecuadas. El coste de las entradas se debe restar al saldo de dicha cuenta.
		 * La cuenta será creada por nosotros con un saldo inicial concreto.
		 */
		
		int opcion;
		double saldo = 10000;
		
		System.out.println("Bienvenido a mi programa");
		
		do {
			System.out.println("\nEliga una opción");
			System.out.println("0. Para salir");
			System.out.println("1. Ver saldo");
			System.out.println("2. Comprar entradas");
			System.out.println("3. Ingresar dinero");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.printf("Tienes %.2f€\n",saldo);
				
				break;

			default:
				break;
			}
			
		} while (opcion!=0);
		
	}

}
