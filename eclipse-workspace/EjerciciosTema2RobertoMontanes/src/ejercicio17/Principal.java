package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Se desea realizar un programa que gestione las notas de un alumno del centro.
		 * Para ello, se necesita leer las notas de las 6 asignaturas de un solo alumno
		 * y mostrar por pantalla al final, la nota media y el número de suspensos que
		 * tiene. No usar una variable para cada nota, ni es necesario mostrar las notas
		 * de cada asignatura, solo la media y el número de suspensos.
		 */
		
		double nota;
		double notaMedia = 0;
		int NumSuspensos = 0;
		double notaMediaTotal = 0;
		String notasConcatenadas = "";
		int numeroNotas = 6;
		
		System.out.println("Hola en este programa vamos a hacer calculos con las notas de un alumno");
		
		for (int i = 0; i < 6 ; i++) {
			
			System.out.println("Dime tu nota");
			nota = Leer.datoDouble();
		
			if (nota<5) {
				NumSuspensos++;			
			}	
			notaMedia += nota;
			notaMediaTotal = notaMedia/numeroNotas;
			notasConcatenadas += nota + " \n";
		}
		
		System.out.printf("Estas son tus notas:\n%S",notasConcatenadas);
		System.out.println("\n---------------------------------");
		System.out.printf("Tu nota media es: %.2f",notaMediaTotal);
		System.out.println("\n---------------------------------");

		System.out.println("Has suspendido "+NumSuspensos+" asignaturas");

		System.out.println("\nGracias por usar mi programa");
}

}