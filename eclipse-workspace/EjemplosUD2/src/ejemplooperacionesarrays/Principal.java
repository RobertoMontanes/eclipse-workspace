package ejemplooperacionesarrays;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {


		
		int numeros[];
		int tam;
		int elegida = 0;
		int nuevoValor;
		
		System.out.println("Bienvenido a mi programa");

		
		System.out.println("Diga el tamaño del array");
		tam = Leer.datoInt();
		numeros = new int [tam];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Diga número");
			numeros[i] = Leer.datoInt();
		}
	
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" \t");
			
		}
		System.out.println("\nDiga el elemento a modificar ");
		elegida = Leer.datoInt();
		
		System.out.println("Diga un nuevo valor");
		nuevoValor = Leer.datoInt();
		numeros[elegida-1] = nuevoValor;
			
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" \t");
			
		}
		
		System.out.println("\nDiga el elemento a modificar");
		elegida = Leer.datoInt();
		
		
		while (elegida < 0 || elegida > numeros.length) {
			System.out.println("Invalido, otro");
			elegida = Leer.datoInt();
		}
		System.out.println("Diga un nuevo valor");
		nuevoValor = Leer.datoInt();
		numeros[elegida-1] = nuevoValor;
			
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" \t");
			
		}	
	}		
}

