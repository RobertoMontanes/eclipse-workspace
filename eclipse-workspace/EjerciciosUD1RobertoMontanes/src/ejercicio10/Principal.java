package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva 4
unidades de un producto que cuesta 12,99 € y se le aplica un descuento del 3 % al precio total.*/
		
		double cantidadproducto;
		double precioproducto;
		double descuento;
		double preciofinal;
		double preciodescontado;
		double cien = 100;
		
		
		System.out.println("Hola, con este programa vamos a calcular cuanto "
				+ "cuesta un producto dependiendo de la cantidad del mismo que "
				+ "te lleves y su descuento");
		
		System.out.println("¿Cuánto cuesta el producto que ha elegido?");
		precioproducto = Leer.datoDouble();
		System.out.println("¿Cuántos productos se ha llevado?");
		cantidadproducto = Leer.datoDouble();
		System.out.println("¿Qué descuento le quiere aplicar?");
		descuento = Leer.datoDouble();
		
		preciofinal = precioproducto*cantidadproducto;
		preciodescontado = preciofinal*(descuento/cien);
		
		System.out.printf("El precio de cada producto es %.2f€. Te has llevado %f productos.\nTiene un descuento del %.2f\n"
				+ "El total sin descuento es %.2f€\nY el precio con descuento es %.2f€", precioproducto, cantidadproducto, descuento, preciofinal, preciodescontado);
		
	}

}
