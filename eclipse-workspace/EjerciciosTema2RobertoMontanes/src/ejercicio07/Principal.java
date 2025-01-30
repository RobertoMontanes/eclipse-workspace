package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double precioProducto;
        int cantidad;
        double descuentoPorcentaje;
        double total;
        double precioFinal;
        int cien = 100;


        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Leer.datoDouble();

        System.out.print("Ingrese la cantidad que se lleva: ");
        cantidad = Leer.datoInt();

        total = precioProducto * cantidad;
        System.out.printf("El total antes de aplicar descuento es: %.2f €\n", total);

        if (total > cien) {
            System.out.print("Ingrese el porcentaje de descuento: ");
            descuentoPorcentaje = Leer.datoDouble();

            precioFinal = total - (total * (descuentoPorcentaje / cien));
            System.out.printf("El precio final después del descuento es: %.2f €\n", precioFinal);
        } else {
            System.out.println("No hay descuento. El total es: " + total + " €");
        }
		
	}

}
