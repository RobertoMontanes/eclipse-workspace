package Ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clase clase = new Clase();
        int opcion;

        do {
            System.out.println("\n1. Agregar Alumno");
            System.out.println("2. Mostrar Alumno");
            System.out.println("3. Modificar Nota");
            System.out.println("4. Eliminar Alumno");
            System.out.println("5. Mostrar Todos");
            System.out.println("6. Nota Media");
            System.out.println("7. Número de Suspensos");
            System.out.println("8. Media de Suspensos");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    clase.agregarAlumno(nombre, nota);
                    break;
                case 2:
                    System.out.print("Nombre del alumno a buscar: ");
                    clase.mostrarAlumno(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Nombre del alumno: ");
                    nombre = sc.nextLine();
                    System.out.print("Nueva nota: ");
                    nota = sc.nextDouble();
                    clase.modificarNota(nombre, nota);
                    break;
                case 4:
                    System.out.print("Nombre del alumno a eliminar: ");
                    clase.eliminarAlumno(sc.nextLine());
                    break;
                case 5:
                    clase.mostrarTodos();
                    break;
                case 6:
                    System.out.println("Nota media: " + clase.calcularNotaMedia());
                    break;
                case 7:
                    System.out.println("Número de suspensos: " + clase.contarSuspensos());
                    break;
                case 8:
                    System.out.println("Media de suspensos: " + clase.mediaSuspensos());
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 9);
        sc.close();
    }
}

