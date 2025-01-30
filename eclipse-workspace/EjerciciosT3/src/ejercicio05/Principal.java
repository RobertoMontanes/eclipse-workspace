package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo
		 * mal para no olvidarlo. Realizar un programa que lea un texto del teclado y un
		 * número entero y muestre en pantalla dicho texto una cantidad de veces igual
		 * al número introducido. La clase se puede llamar "Copiado".
		 */
		
		String texto;
		int repeticiones;
		Copiado c = new Copiado();
		
		
		System.out.println("Dime la cadena de texto a repetir");
		texto = Leer.dato();
		System.out.println("Dime cuantas veces quieres que se repita");
		repeticiones = Leer.datoInt();
		
		System.out.println(c.repetirTexto(texto, repeticiones));
		
		
	}

}
