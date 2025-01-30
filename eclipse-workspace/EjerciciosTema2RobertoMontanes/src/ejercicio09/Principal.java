package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		 int numeroEntradas;
	        double precioEntrada;
	        double total;
	        double descuentoPorcentaje;
	        double precioFinal;
	        String diaSemana;

	        System.out.print("Ingrese el número de entradas: ");
	        numeroEntradas = Leer.datoInt();

	        System.out.print("Ingrese el precio de la entrada: ");
	        precioEntrada = Leer.datoDouble();

	        total = numeroEntradas * precioEntrada;
	        System.out.printf("El total antes de aplicar descuento es: %.2f €\n", total);

	        System.out.print("Ingrese el día de la semana: ");
	        diaSemana = Leer.dato();

	        if (diaSemana.equalsIgnoreCase("miércoles")) {
	            System.out.print("Ingrese el porcentaje de descuento: ");
	            descuentoPorcentaje = Leer.datoDouble();

	            precioFinal = total - (total * (descuentoPorcentaje / 100));
	            System.out.printf("El precio final después del descuento es: %.2f €\n", precioFinal);
	        } else {
	            System.out.println("No hay descuento. El total es: " + total + " €");
	        }
		
	}

}
