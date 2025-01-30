package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Declarar 3 variables de tipo entero (int) con valores 3, 5, 9. Sumarlas
		 * guardando el resultado en una nueva variable. Restar 1 a dicha variable,
		 * almacenando en una variable diferente. Imprimir el resultado almacenado en
		 * esa variable por la salida estándar.
		 */
		int primerNumero = 3;
		int segundoNumero = 5; 
		int tercerNumero = 9;
		int suma;
		int resta;
		int total;
		suma = primerNumero+segundoNumero+tercerNumero;
		resta = -1;
		total = suma + resta;
		
		System.out.println("hola en este programa vamos a sumar y restar variables");
		System.out.println("El total es "+total);
		
		
	}

}
