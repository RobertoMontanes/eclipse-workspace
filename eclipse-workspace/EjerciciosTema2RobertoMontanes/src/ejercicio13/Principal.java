package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		 int diaNumero;
		 
		 
        System.out.print("Ingrese un número del 1 al 7 para conocer el día de la semana: ");
        diaNumero = Leer.datoInt();

        switch (diaNumero) {
            case 1:
                System.out.println("El día de la semana es: Lunes");
                break;
            case 2:
                System.out.println("El día de la semana es: Martes");
                break;
            case 3:
                System.out.println("El día de la semana es: Miércoles");
                break;
            case 4:
                System.out.println("El día de la semana es: Jueves");
                break;
            case 5:
                System.out.println("El día de la semana es: Viernes");
                break;
            case 6:
                System.out.println("El día de la semana es: Sábado");
                break;
            case 7:
                System.out.println("El día de la semana es: Domingo");
                break;
            default:
                System.out.println("Número no válido. Debe ser del 1 al 7.");
        }

		
	}

}
