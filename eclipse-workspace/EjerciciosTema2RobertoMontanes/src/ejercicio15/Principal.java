package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 15. Leer un número entero y mostrar su tabla de multiplicar.
		 */
		
		int numero;
		
		System.out.println("Bienvenido a mi programa");
		
		System.out.println("Dime un número entero yo te mostraré su tabla de multiplicar");
		numero = Leer.datoInt();
		
		System.out.println(numero+" * 1 = "+numero*1);
		System.out.println(numero+" * 2 = "+numero*2);
		System.out.println(numero+" * 3 = "+numero*3);
		System.out.println(numero+" * 4 = "+numero*4);
		System.out.println(numero+" * 5 = "+numero*5);
		System.out.println(numero+" * 6 = "+numero*6);
		System.out.println(numero+" * 7 = "+numero*7);
		System.out.println(numero+" * 8 = "+numero*8);
		System.out.println(numero+" * 9 = "+numero*9);
		System.out.println(numero+" * 10 = "+numero*10);

	}

}
