package ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Club club = new Club();
        CRUDSocio crud = club.getCrudSocio();
        int opcion;

        do {
            System.out.println("\n🏆 Club de Campo - Gestión de Socios\n");
            System.out.println("1️ Agregar socio");
            System.out.println("2 Buscar socio por ID");
            System.out.println("3 Listar todos los socios");
            System.out.println("4 Modificar socio");
            System.out.println("5 Eliminar socio");
            System.out.println("0️ Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del socio: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese nombre del socio: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad del socio: ");
                    int edad = scanner.nextInt();
                    crud.agregarSocio(new Socio(id, nombre, edad));
                    break;

                case 2:
                    System.out.print("Ingrese ID del socio a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Socio socioEncontrado = crud.buscarSocio(idBuscar);
                    if (socioEncontrado != null) {
                        System.out.println("🔍 Socio encontrado: " + socioEncontrado);
                    } else {
                        System.out.println("❌ No se encontró un socio con ID " + idBuscar);
                    }
                    break;

                case 3:
                    crud.listarSocios();
                    break;

                case 4:
                    System.out.print("Ingrese ID del socio a modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese nueva edad: ");
                    int nuevaEdad = scanner.nextInt();
                    crud.modificarSocio(idModificar, nuevoNombre, nuevaEdad);
                    break;

                case 5:
                    System.out.print("Ingrese ID del socio a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    crud.eliminarSocio(idEliminar);
                    break;

                case 0:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}

