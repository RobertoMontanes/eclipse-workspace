package ejercicio9;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {

		String pueblo;
		double personasporpueblo;
		double campnou = 99354;
		double estadioolimpico = 65000;
		double teatrocolegio = 600;
		double espaciocampnou;
		double espacioestadioolimpico;
		double espacioteatrocolegio;

		System.out.println(
				"Hola, en este ejercicio vamos a ver como calcular el numero de personas que caben en diferentes escenarios\n");

		System.out.println("En qué pueblo vives?");
		pueblo = Leer.dato();
		System.out.println("Cuántas personas habitan tu pueblo?");
		personasporpueblo = Leer.datoDouble();

		System.out.println("\nAhora vamos a calcular cuantos pueblos cómo " + pueblo + " caben en los diferentes escenarios\n");

		espaciocampnou = campnou / personasporpueblo;
		System.out.printf("En el CampNou caben %.2f pueblos como %S",espaciocampnou, pueblo);

		espacioestadioolimpico = estadioolimpico / personasporpueblo;
		System.out.printf("\nEn el Estadio Olímpico caben %.2f pueblos como %S", espacioestadioolimpico, pueblo);

		espacioteatrocolegio = teatrocolegio / personasporpueblo;
		System.out.printf("\nEn el teatro del colegio caben %.2f pueblos como %S", espacioteatrocolegio, pueblo);

		System.out.println("\n\nEste ha sido mi Ejercicio9, espero que le haya gustado");

				}

}
