package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		
		/*Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo
de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como
áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc.*/
		
		
		double radiocircunferencia; //2 * PI * radio
		double longitudcir;
		double radiocirculo; //pi * Radio2
		double areacirculo;
		
		System.out.println("Hola, en este codigo vamos a ver como "
				+ "calcular la longitud de una circunferencia y el área de un circulo\n");
		
		System.out.println("Ahora vamos a calcular la longitud de una circunferencia, dime cual quieres que sea su radio");
		radiocircunferencia = Leer.datoDouble();
		longitudcir=2*Math.PI*radiocircunferencia;
		
		System.out.printf("La longitud de una circunferencia es: %.2f metros", longitudcir);
		
		System.out.println("\n\nAhora dime el área del circulo");
		radiocirculo  =Leer.datoDouble();
		areacirculo = Math.PI*radiocirculo*radiocirculo;
		
		System.out.printf("El área del circulo es: %.2f metros", areacirculo);
		
		
		
		
	}

}
