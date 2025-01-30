package ejercicioarray02;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.print("Presiona 1 para continuar o 0 para salir: ");
            opcion = Leer.datoInt();

            if (opcion == 1) {
                int[] numeros = new int[10];

                System.out.print("Ingresa un número base: ");
                int base = Leer.datoInt();

                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = base * 2;
                    base++;  
                }

                System.out.println("Los números multiplicados por 2 son:");
                for (int numero : numeros) {
                    System.out.println(numero);
                }
            } else if (opcion == 0) {
                System.out.println("Programa finalizado. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);  
    }
}
