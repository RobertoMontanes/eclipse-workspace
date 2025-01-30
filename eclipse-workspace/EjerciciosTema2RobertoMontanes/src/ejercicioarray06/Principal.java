package ejercicioarray06;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo"};
        double[] precios = new double[meses.length];

        Random random = new Random();

        System.out.println("Bienvenido a mi codigo \n");

        // Generar precios aleatorios entre 10.0 y 100.0
        for (int i = 0; i < precios.length; i++) {
            precios[i] = 10 + (90 * random.nextDouble()); // Precio entre 10.0 y 100.0
        }

        // Imprimir meses
        for (String mes : meses) {
            System.out.print(mes + "\t");
        }
        System.out.println();

        // Imprimir precios
        for (double precio : precios) {
            System.out.printf("%.2f\t", precio);
        }
        System.out.println();
        System.out.println("Gracias por usar mi programa");
    }
}
