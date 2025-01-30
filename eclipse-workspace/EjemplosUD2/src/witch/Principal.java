package witch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion=0;

		System.out.println("Hola, estas son las opciones, pulse la opción adecuada");

		System.out.println("1. Para refranes");
		System.out.println("2. Para letras de canciones");
		System.out.println("3. Para frases hechas");
		opcion = Leer.datoInt();
		
		switch (opcion) {

			case 1: 
				
				System.out.println("No por mucho madrugar amanece mas temprano");
				break;
			case 2:
				System.out.println("Ama y ensancha el alma");
				break;
			case 3:
				System.out.println("No ni na");
			
			default:
				System.out.println("Opción incorrecta");
				break;
		}

	}

}