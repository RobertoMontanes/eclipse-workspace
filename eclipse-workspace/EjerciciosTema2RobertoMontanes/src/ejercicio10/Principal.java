package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double peso;
        double altura;
        double imc;

        // Pedir datos al usuario
        System.out.print("Ingrese su peso en kg: ");
        peso = Leer.datoDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = Leer.datoDouble();

        // Calcular el IMC
        imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f\n", imc);

        // Determinar el estado de salud
        if (imc < 16) {
            System.out.println("Diagnóstico: Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Diagnóstico: Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Diagnóstico: Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Diagnóstico: Peso normal (saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Diagnóstico: Sobrepeso (obesidad de grado I)");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Diagnóstico: Sobrepeso crónico (obesidad de grado II)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Diagnóstico: Obesidad premórbida (obesidad de grado III)");
        } else {
            System.out.println("Diagnóstico: Obesidad mórbida (obesidad de grado IV)");
        }
		
	}

}
