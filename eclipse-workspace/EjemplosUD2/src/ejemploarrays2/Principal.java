package ejemploarrays2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int tam;
		int edades[];
		int op;
		int buscar;
		
		System.out.println("Diga numero de alumnos");
		tam = Leer.datoInt();
		edades = new int [tam];
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Dime la edad");
			edades[i] = Leer.datoInt();
		}
		for (int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + " \t");
		}
		
		System.out.println("\nDiga el elemento que quiera buscar");
		op = Leer.datoInt();
		
		System.out.println(edades[op-1]);
		
		System.out.println("Diga la edad qu quiera buscar");
		buscar = Leer.datoInt();
		op = Leer.datoInt()-1;
		
		
	}

}
