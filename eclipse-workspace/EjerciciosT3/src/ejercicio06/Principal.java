package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		Generadora g = new Generadora();

		System.out.println("Bienvenido a mi programa\n");

		// Quiniela
		System.out.print("Jugando a la quiniela:\n");
		System.out.println("Resultado: " + g.generarQuiniela());

		// Pares o nones
		System.out.println("\nJugando a pares o nones...");
		System.out.println("Resultado: " + g.generarParImpar());

		// Chinos
		System.out.println("\nJugando a los chinos...");
		System.out.println("Resultado: " + g.generarChinos());

		// Primitiva
		System.out.println("\nSorteo de la primitiva...");
		System.out.println("Número generado: " + g.generarPrimitiva());

		GeneradoraVersion2 g1 = new GeneradoraVersion2();
		
		

		
	
	}
}
