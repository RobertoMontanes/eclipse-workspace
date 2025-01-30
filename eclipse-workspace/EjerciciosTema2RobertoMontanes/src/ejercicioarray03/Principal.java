package ejercicioarray03;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int suma = 0;
        int cantidadCeros = 0;

        System.out.println("Ingresa 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = Leer.datoInt();
            suma += numeros[i];

            if (numeros[i] == 0) {
                cantidadCeros++;
            }
        }

        double media = (double) suma / numeros.length;

        System.out.println("La media de los elementos es: " + media);
        System.out.println("Cantidad de ceros introducidos: " + cantidadCeros);
    }
}
