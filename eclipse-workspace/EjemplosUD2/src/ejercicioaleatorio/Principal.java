package ejercicioaleatorio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int hasta;
		int desde;
		int aleatorio;
		int tiradas, contador =0;
		
		
		
		Random num = new Random(System.nanoTime());
		
		System.out.println("hola, genero dos numero aleatorios");
		System.out.println("Diga el mayor");
		hasta = Leer.datoInt();
		System.out.println("Diga el menor");
		desde = Leer.datoInt();
		System.out.println("Digame cuantas tiradas quiere");
		tiradas = Leer.datoInt();
		
		do {
			contador++;
			aleatorio=num.nextInt(hasta-desde+1)+desde;
			System.out.println("El numero de tirada es "+contador+" y el resultado es "+aleatorio);
			
		} while (contador<tiradas);
		
		
		
	}

}
