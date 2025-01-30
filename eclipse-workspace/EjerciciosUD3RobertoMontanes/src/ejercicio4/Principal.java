package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double lado;
		double areacuadrado;
		
		System.out.println("Bienvenidos a mi programa, vamos a calcular el área de un cuadrado");
		
		System.out.println("Dame el lado del cuadrado (Metros)");
		lado = Leer.datoDouble();
		System.out.printf("\n\n  %.2f Metros", lado);
		System.out.println("\n*****************\t\n*\t\t*\n*\t\t*\n*\t\t*\n*\t\t*\n*\t\t*\n*****************");
		areacuadrado = lado*lado;
		System.out.printf("El área de un cuadrado es %.2f * %.2f = %.2f metros", lado, lado, areacuadrado);
		
		

		
	}

}
