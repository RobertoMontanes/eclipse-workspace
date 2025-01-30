package ejercicioarray04;

import utilidades.Leer;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(99) + 1;
            suma += numeros[i];
        }

        System.out.print("Ingresa una posición (0-9) para ver el número guardado: ");
        int posicion = Leer.datoInt();

        if (posicion >= 0 && posicion < numeros.length) {
            System.out.println("Número guardado en la posición " + posicion + ": " + numeros[posicion]);
        } else {
            System.out.println("Posición inválida.");
        }

        double media = (double) suma / numeros.length;

        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }
}
