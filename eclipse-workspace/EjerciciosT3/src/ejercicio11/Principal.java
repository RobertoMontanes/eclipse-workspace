package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Crear un programa para poner las notas de un alumno (clase Alumno con
		 * atributos). Los atributos de un alumno son su nombre, curso, un array de
		 * notas, número de suspensos y nota media. En una clase GestionNotas, el
		 * programa debe poder poner notas a un solo alumno, mostrar todas sus notas por
		 * pantalla, modificar una nota, calcular la media y dar su número de suspensos.
		 * Probar todo en la clase Principal.
		 * 
		 */

		int opcion;
		double notas;
		int numNotas = 0;
		Alumno a = new Alumno();
		GestionNotas g;

		System.out.println("Bienvenido a mi programa\n");

		do {

			System.out.println("Elige una opción");
			System.out.println("Pulsa 0. para salir del programa");
			System.out.println("Pulsa 1. para poner notas a alumno");
			System.out.println("Pulsa 2. para mostrar todas sus notas");
			System.out.println("Pulsa 3. para modificar una nota");
			System.out.println("Pulsa 4. para calcular la media");
			System.out.println("Pulsa 5. para ver número de suspensos");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:

				System.out.println("Saliendo...");

				break;
			case 1:

				System.out.println("Dime cuántas notas quieres ponerle al alumno");
				numNotas = Leer.datoInt();
				a = new Alumno(numNotas);
				g = new GestionNotas(a);
				for (int i = 0; i < numNotas; i++) {
					System.out.println("Agrega notas al alumno");
					notas = Leer.datoDouble();
					g.agregarNotas(notas); // Guarda la nota en el array del alumno
					
				}
				
				break;
			case 2:
			    if (a != null) {
			        double[] notasAlumno = a.getNotas();

			        if (notasAlumno != null && notasAlumno.length > 0) {
			            System.out.println("Notas del alumno:");

			            for (double nota : notasAlumno) {
			                System.out.println(nota);
			            }
			        } else {
			            System.out.println("El alumno no tiene notas registradas.");
			        }
			    } else {
			        System.out.println("Primero debes ingresar las notas del alumno en la opción 1.");
			    }
			    break;

			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			default:
				System.out.println("Número inválido\n");
				break;
			}

		} while (opcion != 0);
	}

}
