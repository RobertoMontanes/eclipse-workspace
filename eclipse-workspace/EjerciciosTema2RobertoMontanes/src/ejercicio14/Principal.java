package ejercicio14;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

    	int mes;
        int anio;
        int dias;

        System.out.print("Ingrese el mes (1-12): ");
        mes = Leer.datoInt();
        
        System.out.print("Ingrese el año: ");
        anio = Leer.datoInt();

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero

                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28; 
                }
                break;
            default:
                System.out.println("Mes no válido. Debe estar entre 1 y 12.");
                return;
        }

        System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");
    }
}
