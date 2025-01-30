package ejercicioarray05;

import utilidades.Leer;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = Leer.datoInt();

        int[] numeros = new int[tamaño];
        Random rand = new Random();

        System.out.print("Introduce el valor mínimo: ");
        int valorMinimo = Leer.datoInt();
        System.out.print("Introduce el valor máximo: ");
        int valorMaximo = Leer.datoInt();

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = rand.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        int suma = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            suma += numero;
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("La suma de todos los elementos es: " + suma);
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

        System.out.print("Introduce la posición del valor que deseas modificar (0-" + (tamaño - 1) + "): ");
        int posicion = Leer.datoInt();

        if (posicion >= 0 && posicion < tamaño) {
            System.out.print("Introduce el nuevo valor: ");
            numeros[posicion] = Leer.datoInt();
            System.out.println("Valor en la posición " + posicion + " modificado.");
        } else {
            System.out.println("Posición inválida.");
        }
    }
}
