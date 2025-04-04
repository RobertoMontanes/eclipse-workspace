package ejercicio04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Borrar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Modificar teléfono");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
             

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, apellido), telefono);
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    apellido = scanner.nextLine();
                    agenda.borrarContacto(new Contacto(nombre, apellido));
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.println("Resultado: " + agenda.buscarPorNombre(nombre));
                    break;
                case 5:
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    apellido = scanner.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    telefono = scanner.nextLine();
                    agenda.modificarTelefono(new Contacto(nombre, apellido), telefono);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    
            }
        } while (opcion != 0);

        scanner.close();
    }
}

 
