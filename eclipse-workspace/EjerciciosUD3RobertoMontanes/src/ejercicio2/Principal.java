package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * . Realizar un programa que calcule el espacio recorrido por un objeto que se
		 * mueve a velocidad constante. El objeto, por ejemplo, zapatilla de una madre
		 * hacia el hijo, ha recorrido un espacio inicial en metros (leído por teclado)
		 * y se mueve a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor
		 * al tiempo que el objeto está en movimiento. La ecuación usada es: 
		 * 
		 * espacio = * espacioInicial + velocidad * tiempo
		 */
		
		
		
		double velocidad;
		double recorridoInicial;
		double espacio;
		double tiempo;
		
		System.out.println("Hola en este programa vamos a ver a que distancia te golpea un objeto si...");
		System.out.println("Su velocidad constante es: (m/s)");
		velocidad = Leer.datoDouble();
		System.out.println("Los metros que lleva recorrido son: (Metros)");
		recorridoInicial = Leer.datoDouble();
		System.out.println("Si el objeto lleva en movimiento: (s)");
		tiempo = Leer.datoDouble();
		
		espacio = recorridoInicial + velocidad * tiempo;
		System.out.printf("Para que la chancla te de en la cara tiene que pasar %.2f segundos en el aire", espacio);
	
	}

}
