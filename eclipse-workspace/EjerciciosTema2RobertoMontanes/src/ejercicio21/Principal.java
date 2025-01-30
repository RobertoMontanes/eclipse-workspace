package ejercicio21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Realizar una “mini-calculadora”, que realice las siguientes operaciones:
		 * suma, resta, multiplicación, división y decir si un número es par o impar. Se
		 * hará con un menú, y se pedirá en cada caso del switch los datos necesarios
		 * para realizar las operaciones. Se valorarán las comprobaciones que se hagan
		 * sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */
		int opcion;
		double numero1, numero2, resultado;

		
		System.out.println("Bienvenido\n");
		
		do {

			System.out.println("\n0. Para salir");
			System.out.println("1. Para suma");
			System.out.println("2. Para resta");
			System.out.println("3. Para multiplicación");
			System.out.println("4. Para división");
			System.out.println("5. Para saber si es par o impar");


			opcion = Leer.datoInt();

			switch (opcion) {
				case 0:
					System.out.println("Saliendo...");
					
					
					break;
				case 1:
					
					System.out.println("Dime un número");
					numero1 = Leer.datoDouble();
					System.out.println("Dime otro número");
					numero2 = Leer.datoDouble();
					
					resultado = numero1+numero2;
					
					System.out.printf("El resultado es %.2f\n\n",resultado);
					
					break;
				case 2:
					
					System.out.println("Dime un número");
					numero1 = Leer.datoDouble();
					System.out.println("Dime otro número");
					numero2 = Leer.datoDouble();
					
					resultado = numero1-numero2;
					
					System.out.printf("El resultado es %.2f\n\n",resultado);

					break;
				case 3:
					
					System.out.println("Dime un número");
					numero1 = Leer.datoDouble();
					System.out.println("Dime otro número");
					numero2 = Leer.datoDouble();
					
					resultado = numero1*numero2;
					
					System.out.printf("El resultado es %.2f\n\n",resultado);

					break;
				case 4:
					
					System.out.println("Dime un número");
					numero1 = Leer.datoDouble();
					System.out.println("Dime otro número");
					numero2 = Leer.datoDouble();
					
					while (numero2 == 0) {
						System.out.println("No puedes dividir entre 0");
						System.out.println("introduzca otro número");
						numero2 = Leer.datoDouble();
					}
					
					resultado = numero1/numero2;
					
					System.out.printf("El resultado es %.2f\n\n",resultado);
					
					break;

				case 5:
					System.out.println("Dime un número");
					numero1 = Leer.datoDouble();
					
					if (numero1 % 2 == 0) {
						System.out.println("El resultado es par");
					}else {
						System.out.println("El resultado es impar");
					}
				default:
					System.out.println("Número Incorrecto");
					break;
				
			}

		} while (opcion!= 0);

	}

}
