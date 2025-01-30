package ejercicio3;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {

		/*
		 * Realizar un programa que lea por teclado un valor correspondiente a una
		 * distancia en millas marinas (con decimales) y las escriba expresadas en
		 * metros. Sabiendo que 1 milla marina equivale a 1852 metros.
		 */
		
		double millasMarinas;
		double metros;
		        // Solicitar al usuario que ingrese una distancia en millas marinas
		        System.out.print("Ingrese la distancia en millas marinas: ");
		        millasMarinas = Leer.datoDouble();
		        
		        // Realizar la conversión a metros
		        metros = millasMarinas * 1852;
		        
		         //Mostrar el resultado
		       System.out.printf("La distancia en metros es: %.2f metros", metros);
		    }
		}