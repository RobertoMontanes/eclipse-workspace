package ejemploarrayaleatorio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int tam;
		int edades[];
		int hasta, desde;
		int buscado;
		int contador = 0;
		int  suma = 0;
		double media;
		
		Random rnd = new Random(System.nanoTime());
		
		System.out.println("Bienvenido a mi programa\n");
		
		System.out.println("Diga tamaño");
		tam = Leer.datoInt();
		
		edades = new int [tam];
		
		//Rellenar con aleatorios
		System.out.println("Diga el menor generado");
		desde = Leer.datoInt();
		System.out.println("Diga el mayor generado");
		hasta = Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			edades[i] = rnd.nextInt(hasta-desde+1)+desde; //cuidado con los parentesis, tiene que ser con uno namá
			
		}
		for (int valor : edades) {
			System.out.print(valor +" \t");
		}
		System.out.println("\nQué número quieres buscar");
		buscado = Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == buscado) {
				contador++;
			}
		}
		System.out.println("Hay: "+contador+" números "+buscado);
		
		for (int i = 0; i < edades.length; i++) {
			suma = suma+edades[i];
			
		}
		media = suma/edades.length;
		System.out.printf("La media es: %.2f \n", media);
		
		//Imprimir forma de tabla
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("Alumno"+(i+1)+" ");
		}
		System.out.println("\n");
		for (int i = 0; i < edades.length; i++) {
			System.out.print("  "+edades[i]+"\t");
		}
		System.out.println("\nCambiame al alumno 3 la edad");
		edades[2] = Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("  "+edades[i]+"\t");
		}
	}

}	
