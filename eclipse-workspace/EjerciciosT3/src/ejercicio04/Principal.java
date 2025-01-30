package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		//Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis decidir qué método usar y
		//qué valores pasarle. Se debe tener la clase Cilindro.
		
		Cilindro c1 = new Cilindro();
		double radio; //Las variables no tienen por qué 
		double altura;//llamarse como los atributos.

		System.out.println("Cuánto quieres que sea el radio del cilindro?");
		radio = Leer.datoDouble();
		System.out.println("Cuánto quieres que sea la altura del cilindro?");
		altura = Leer.datoDouble();
		
		System.out.println("El volumen del cilindro es: " + c1.calcularVolumen(radio, altura));
	}

}
