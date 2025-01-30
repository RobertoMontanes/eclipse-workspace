package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// Realizar un programa que lea un valor entero por teclado y muestre por
		// pantalla su doble, su triple y
		// su mitad

		double valor;
		double valordoble;
		double valortriple;
		double valormitad;
		
		System.out.println("Buenas, en este programa vamos a leer un valor y mostrarlo de diferentes formas");

		System.out.println("Dime el valor que quieras duplicar y triplicar y dividir por su mitad ");
		valor = Leer.datoDouble();

		valordoble = valor*2;
		valortriple = valor*3;
		valormitad = valor/2;
		System.out.println("Doble: "+valordoble);
		System.out.println("Triple: "+valortriple);
		System.out.println("Mitad: "+valormitad);
		
		System.out.println("Este ha sido mi código, gracias por usarlo");
	}

}
