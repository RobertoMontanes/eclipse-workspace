package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Crear un programa que reciba por teclado 3 notas, calcule la media y diga si
		 * la media sale aprobada o no
		 */
	
		double nota1;
		double nota2;
		double nota3;
		double media;
		int numeroNotas = 3;
		double aprobado = 5;
		int numeroSuspenso = 0;
		
		
		System.out.println("Hola en este código"
				+ "vamos a hacer la media"
				+ "de tres notasy calcular su media");
		
		System.out.println("Dime la primera nota");
		nota1 = Leer.datoDouble();
		System.out.println("Dime la segunda nota");
		nota2 = Leer.datoDouble();
		System.out.println("Dime la tercera nota");
		nota3 = Leer.datoDouble();
		
		media = (nota1 + nota2 + nota3) / numeroNotas;
		
		if (media>=aprobado) {
			System.out.println("Tu media es aprobada");
			System.out.printf("En total: %.2f",media);
		}else { 
			System.out.println("Tu media está suspensa");
			System.out.printf("En total: %.2f",media);
		}
		if (nota1<aprobado) {
			
			numeroSuspenso++; //NumeroSuspenso = NumeroSuspenso + 1
		
		}
		if (nota2<aprobado) {
			
			numeroSuspenso++; //NumeroSuspenso = NumeroSuspenso + 1
		
		}
		if (nota3<aprobado) {
			
			numeroSuspenso++; //NumeroSuspenso = NumeroSuspenso + 1
		
		}
		System.out.println("\nTiene usted "+numeroSuspenso+" suspensos");
		
			
		}
	}


