package ejercicio10V2.copy;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maquina maquina = new Maquina(1.50); // El precio inicial de un billete es 1.50

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Comprar billetes");
            System.out.println("2. Ver saldo total");
            System.out.println("3. Operaciones de operario");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Comprar billetes
                    System.out.print("¿Cuántas personas? ");
                    int personas = scanner.nextInt();
                    System.out.print("Introduce el dinero recibido: ");
                    double dinero = scanner.nextDouble();
                    Ticket ticket = maquina.comprarBilletes(personas, dinero);
                    maquina.imprimirTicket(ticket);
                    break;
                case 2: // Ver saldo total
                    maquina.verSaldoTotal();
                    break;
                case 3: // Operaciones de operario
                    System.out.print("Introduce la contraseña: ");
                    scanner.nextLine();  // Limpiar buffer
                    String contrasena = scanner.nextLine();
                    if (maquina.comprobarContrasena(contrasena)) {
                        System.out.println("Contraseña correcta.");
                        System.out.println("1. Ver saldo total");
                        System.out.println("2. Reiniciar saldo total");
                        System.out.println("3. Cambiar precio billete");
                        System.out.print("Selecciona una opción: ");
                        int opcionOperario = scanner.nextInt();
                        switch (opcionOperario) {
                            case 1:
                                maquina.verSaldoTotal();
                                break;
                            case 2:
                                maquina.resetearSaldo();
                                break;
                            case 3:
                                System.out.print("Introduce el nuevo precio: ");
                                double nuevoPrecio = scanner.nextDouble();
                                maquina.cambiarPrecio(nuevoPrecio);
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;
                case 4: // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
