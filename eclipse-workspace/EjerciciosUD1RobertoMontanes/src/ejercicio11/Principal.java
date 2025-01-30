package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * . ¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la
		 * sequía. Han tenido que abrir pozos. La capacidad de sacar agua de los pozos
		 * se cuenta por litros por segundo y la capacidad del depósito para guardar el
		 * agua en metros cúbicos. Serías capaz de crear un programa que calcule cuántos
		 * metros cúbicos se sacan de uno de los pozos que tiene un caudal de 8 litros
		 * por segundo si está conectado 24 horas
		 */

		double litroporsegundo;
		double totalnecesidad;
		double tiempoechandoagua;
		double capacidadmaxima;
		double horasasegundos;
		double supertotal;

		System.out.println("Hola, en este ejercicio vamos calcular cuanto gasta "
				+ "nuesro pozo de agua si está conectado 24 horas seguids con un caudal de 8 L/s");

		System.out.println("¿Cuál será el caudal de L/s?");
		litroporsegundo = Leer.datoDouble();

		System.out.println("Durante cuánto tiempo estará encendido");
		tiempoechandoagua = Leer.datoDouble();

		horasasegundos = 86400;
		totalnecesidad = litroporsegundo * horasasegundos;
		capacidadmaxima = tiempoechandoagua * totalnecesidad;
		supertotal = capacidadmaxima / horasasegundos;

		System.out.printf("La capacidad del deposito tiene que tener %.2f litros cúbicos de espacio o mayor", supertotal);
	}

}
