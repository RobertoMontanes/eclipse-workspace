package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double saldo = 1000.0; 
		double cantidadRetiro;

		System.out.print("Ingrese la cantidad que desea retirar: ");
		cantidadRetiro = Leer.datoDouble();

		if (cantidadRetiro > saldo) {
		    System.out.println("No es posible retirar esa cantidad. Saldo insuficiente.");
		} else {
		    saldo -= cantidadRetiro; 
		    System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
		}

		
	}

}
