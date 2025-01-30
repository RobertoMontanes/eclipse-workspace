package ejercicio12;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

        double peso;
        double equivalenciaMercurio = 0.38;
        double equivalenciaVenus = 0.91;
        double equivalenciaTierra = 1;
        double equivalenciaMarte = 0.38;
        double equivalenciaJupiter = 2.53;
        double equivalenciaSaturno = 1.06;
        double equivalenciaUrano = 0.92;
        double equivalenciaNeptuno = 1.2;
        int numerointroducido;
        double equivalencia;

        System.out.println("Hola, en este programa vamos a calcular su peso en distintos planetas");

        System.out.println("\nDime su peso: (KG)");
        peso = Leer.datoDouble();

        System.out.println("\n0. Sal del programa\n1. Mercurio\n2. Venus\n3. Tierra\n4. Marte\n5. Júpiter\n6. Saturno\n7. Urano\n8. Neptuno");

        System.out.println("Introduce un número si quiere saber su peso en otro planeta:");
        
        do {
            numerointroducido = Leer.datoInt();

            switch (numerointroducido) {
                case 0:
                    System.out.println("El programa ha terminado");
                    break;
                case 1:
                    equivalencia = peso * equivalenciaMercurio;
                    System.out.printf("Su peso en Mercurio es %.2fKG\n", equivalencia);
                    break;
                case 2:
                    equivalencia = peso * equivalenciaVenus;
                    System.out.printf("Su peso en Venus es %.2fKG\n", equivalencia);
                    break;
                case 3:
                    equivalencia = peso * equivalenciaTierra;
                    System.out.printf("Su peso en Tierra es %.2fKG\n", equivalencia);
                    break;
                case 4:
                    equivalencia = peso * equivalenciaMarte;
                    System.out.printf("Su peso en Marte es %.2fKG\n", equivalencia);
                    break;
                case 5:
                    equivalencia = peso * equivalenciaJupiter;
                    System.out.printf("Su peso en Júpiter es %.2fKG\n", equivalencia);
                    break;
                case 6:
                    equivalencia = peso * equivalenciaSaturno;
                    System.out.printf("Su peso en Saturno es %.2fKG\n", equivalencia);
                    break;
                case 7:
                    equivalencia = peso * equivalenciaUrano;
                    System.out.printf("Su peso en Urano es %.2fKG\n", equivalencia);
                    break;
                case 8:
                    equivalencia = peso * equivalenciaNeptuno;
                    System.out.printf("Su peso en Neptuno es %.2fKG\n", equivalencia);
                    break;
                default:
                    System.out.println("Número Incorrecto");
            }

        } while (numerointroducido != 0);
    }
}


