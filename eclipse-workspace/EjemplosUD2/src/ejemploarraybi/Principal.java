package ejemploarraybi;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int tam = 4;
		int fila = 2;
		int columna = 3;
		int filaLeida;
		int columnaLeida;
		int nuevoValor;
		
		int numeros[] = new int [tam];
		int [][] lista = new int [fila][columna]; // primer corchete fila y dsp columna
		
		//cargar el array
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.println("Diga numero");
				lista[i][j] = Leer.datoInt();
				
			}
			

		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print("\t"+lista[i][j]);
			}
		}
		System.out.println("\nDiga fila");
		filaLeida = Leer.datoInt();
		System.out.println("Diga Columna");
		columnaLeida = Leer.datoInt();
		System.out.println("Diga el nuevo valor");
		nuevoValor = Leer.datoInt();
		
		lista[filaLeida-1][columnaLeida-1] = nuevoValor;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print("\t"+lista[i][j]);
			}
		}
	}

}
