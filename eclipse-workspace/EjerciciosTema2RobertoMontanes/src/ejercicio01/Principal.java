package ejercicio01;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {

		 System.out.print("Ingrese el primer número: ");
	        int numero1 = Leer.datoInt();
	        
	        System.out.print("Ingrese el segundo número: ");
	        int numero2 = Leer.datoInt();
	        
	        if (numero1 > numero2) {
	            System.out.println("El número mayor es: " + numero1);
	        } else if (numero2 > numero1) {
	            System.out.println("El número mayor es: " + numero2);
	        } else {
	            System.out.println("Ambos números son iguales.");
	        }
		
	}

}
