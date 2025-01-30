package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que calcule la potencia de un número, dado este y su
		 * exponente sin usar Math.pow ( ). Pueden ocurrir tres casos: 
		 * El exponente sea positivo, imprime resultado en pantalla.
		 * El exponente sea 0, el resultado es 1.
		 * El exponente sea negativo, el resultado es 1/potencia con el exponente
		 * positivo
		 */
		
		double numero;
		double exponente;
		double sol;
		
		System.out.println("Hola este es mi código, vamos a hacer un exponente de un número si.....\n");
		System.out.println("Dime el numero que quieras");
		numero = Leer.datoDouble();
		System.out.println("Dime ahora su exponente");
		exponente = Leer.datoDouble();
		
		if (exponente>0) {
			sol = Math.pow(numero, exponente);
			System.out.printf("el resultado es %.2f",sol);
		} if (exponente<0) {
			sol = 1/exponente;
			System.out.printf("El resultado es %.2f",sol);
		} if (exponente==0) {
			sol = 1;
			System.out.printf("El resultado es %.2f",sol);
		} 
			
		}
	}