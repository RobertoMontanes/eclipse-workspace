package ejercicio09;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

        int opcion;
        Sorteo s = new Sorteo();
        int numeroPorTeclado;
        int min = 1;
        int max = 99999;

        System.out.println("Bienvenido a mi programa");
        do {

            System.out.println("\nPulse 0. para salir del programa");
            System.out.println("Pulse 1. para Comprar el décimo que quieras");
            System.out.println("Pulse 2. para comprar un décimo aleatorio");
            System.out.println("Pulse 3. para Hacer un sorteo");
            System.out.println("Pulse 4. para Comprobar si nuestro décimo está premiado");
            System.out.println("Pulse 5. para Mostrar si eres ganador o no");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...\n");
                    break;

                case 1:
                    System.out.println("Diga el número que quiere comprar (entre 00001 y 99999):");
                    numeroPorTeclado = Leer.datoInt();
                    s.comprarNumeroBoleto(numeroPorTeclado); 
                    System.out.println("Ha comprado el número: " + numeroPorTeclado);
                    break;

                case 2:
                    System.out.println("Diga el número más pequeño del sorteo");
                    min = Leer.datoInt();
                    System.out.println("Diga el número más grande del sorteo");
                    max = Leer.datoInt();
                    int numeroAleatorio = s.generarNumeroAleatorio(min, max);
                    System.out.println("Ha comprado el número aleatorio: " + numeroAleatorio);
                    break;

                case 3:
                    System.out.println("¡El sorteo se ha realizado! El número premiado es: " + s.generarNumeroPremiado());
                    break;

                case 4:
                    if (s.comprobarSiHaGanado()) {
                        System.out.println("¡Tu número está premiado!");
                    } else {
                        System.out.println("Tu número no ha sido premiado.");
                    }
                    break;

                case 5:
                    System.out.println(s.mensajeDeResultado());
                    break;

                default:
                    System.out.println("Número inválido. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        System.out.println("Gracias por usar mi programa");
    }
}
